# syntax=docker/dockerfile:1
# SPDX-License-Identifier: MIT

# =============================================================================
# Stage 1: Build ArchitecturalTemplates from source
# =============================================================================
FROM eclipse-temurin:21-jdk-jammy AS at-builder

ARG MAVEN_VERSION=3.9.9

RUN apt-get update && apt-get install -y --no-install-recommends curl git ca-certificates \
	&& rm -rf /var/lib/apt/lists/*

RUN curl -fsSL https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
	| tar xz -C /opt && \
	ln -s /opt/apache-maven-${MAVEN_VERSION}/bin/mvn /usr/local/bin/mvn

WORKDIR /build

# Clone AT, merge both PR branches (Tycho bump + UI constants fix)
RUN git clone --depth 1 https://github.com/PalladioSimulator/Palladio-Addon-ArchitecturalTemplates.git at \
	&& cd at \
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

ARG MAVEN_VERSION=3.9.9
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
# Stage 3: Extract product archive (Linux x86_64)
# =============================================================================
FROM scratch AS artifact
COPY --from=ea-builder \
	/build/ea/releng/org.palladiosimulator.experimentautomation.product/target/products/ExperimentAutomation-linux.gtk.x86_64.tar.gz \
	/product/
