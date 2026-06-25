# syntax=docker/dockerfile:1
# SPDX-License-Identifier: MIT

# =============================================================================
# Stage 1: Build ArchitecturalTemplates from source
# =============================================================================
FROM eclipse-temurin:21-jdk-jammy AS at-builder

ARG MAVEN_VERSION=3.9.16

RUN apt-get update && apt-get install -y --no-install-recommends curl git ca-certificates \
	&& rm -rf /var/lib/apt/lists/*

RUN curl -fsSL https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
	| tar xz -C /opt && \
	ln -s /opt/apache-maven-${MAVEN_VERSION}/bin/mvn /usr/local/bin/mvn

WORKDIR /build

# Clone AT, merge both PR branches (Tycho bump + UI constants fix).
# Full clone (not shallow) needed so git merge can find the common ancestor.
# Set identity for merge commit (doesn't leave the container).
RUN git clone https://github.com/PalladioSimulator/Palladio-Addon-ArchitecturalTemplates.git at \
	&& cd at \
	&& git config user.email "builder@docker" \
	&& git config user.name "Docker Builder" \
	&& git fetch origin bump-tycho-to-4.0.13 fix/extract-ui-constants-to-separate-class \
	&& git checkout bump-tycho-to-4.0.13 \
	&& git merge --no-edit origin/fix/extract-ui-constants-to-separate-class

WORKDIR /build/at
RUN mvn clean package -DskipTests -q

# Path to the AT p2 updatesite
RUN mkdir -p /build/at-repo && \
	cp -r releng/org.palladiosimulator.architecturaltemplates.updatesite/target/repository/* /build/at-repo/

# =============================================================================
# Stage 2: Build ExperimentAutomation + product
# =============================================================================
FROM eclipse-temurin:21-jdk-jammy AS ea-builder

ARG MAVEN_VERSION=3.9.16
ARG EA_BRANCH=product-module

RUN apt-get update && apt-get install -y --no-install-recommends curl git ca-certificates \
	&& rm -rf /var/lib/apt/lists/*

RUN curl -fsSL https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
	| tar xz -C /opt && \
	ln -s /opt/apache-maven-${MAVEN_VERSION}/bin/mvn /usr/local/bin/mvn

COPY --from=at-builder /build/at-repo /build/at-repo

WORKDIR /build

RUN git clone --depth 1 --branch ${EA_BRANCH} \
	https://github.com/PalladioSimulator/Palladio-Addons-ExperimentAutomation.git ea

# Inject local AT p2 repo into the product POM so the director
# prefers the locally-built AT (newer timestamp) over the nightly
RUN cd ea && sed -i '/<\/repositories>/i\
		<repository>\
			<id>local-at<\/id>\
			<layout>p2<\/layout>\
			<url>file:\/\/\/build\/at-repo<\/url>\
		<\/repository>' \
		releng/org.palladiosimulator.experimentautomation.product/pom.xml

WORKDIR /build/ea
RUN mvn clean package -DskipTests -q
RUN mvn clean verify -f releng/org.palladiosimulator.experimentautomation.product/pom.xml -q

# =============================================================================
# Stage 3: Runtime image – product installed + ready to execute
# =============================================================================
FROM eclipse-temurin:21-jre-jammy AS runtime

ARG PRODUCT_ROOT=/opt/experiment-automation

# Install GTK3 + Xvfb so SWT can load in headless containers.
# The product includes UI bundles (Xtext, Eclipse IDE) that cascade into
# SWT/Display initialization even for CLI-only workflows.
RUN apt-get update && apt-get install -y --no-install-recommends \
	libgtk-3-0 libglib2.0-0 xvfb \
	&& rm -rf /var/lib/apt/lists/*

COPY --from=ea-builder \
	/build/ea/releng/org.palladiosimulator.experimentautomation.product/target/products/ExperimentAutomation-linux.gtk.x86_64.tar.gz \
	/tmp/product.tar.gz

RUN mkdir -p ${PRODUCT_ROOT} && \
	tar xzf /tmp/product.tar.gz -C ${PRODUCT_ROOT} --strip-components=1 && \
	rm /tmp/product.tar.gz

# Entrypoint script starts Xvfb, runs Eclipse, propagates exit code.
COPY releng/org.palladiosimulator.experimentautomation.product.docker/docker-entrypoint.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/docker-entrypoint.sh

# Workspace data directory – mount a volume here to persist results / logs.
#   docker run -v /host/path:/data ...
VOLUME /data

# Console log output. Set to "true" to enable Eclipse -consoleLog.
ENV EA_CONSOLE_LOG=

ENTRYPOINT ["docker-entrypoint.sh"]
