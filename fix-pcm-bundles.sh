#!/bin/bash
# Fix PCM OSGi bundle misconfiguration after Eclipse auto-update.
# 
# The Eclipse p2 reconciler sometimes upgrades xtend.lib, xbase.lib, Guava,
# Guice, and MWE bundles to versions that are incompatible with the rest of
# the Xtext 2.30.0 stack that PCM 5.2.2 ships with.
#
# This script reverts those bundles to the known-good versions.

PCM_APP="${1:-/Applications/PCM.app}"
PLUGINS="$PCM_APP/Contents/Eclipse/plugins"
BUNDLES_INFO="$PCM_APP/Contents/Eclipse/configuration/org.eclipse.equinox.simpleconfigurator/bundles.info"
BACKUP_DIR="/tmp/pcm-bundle-fix-$(date +%Y%m%d-%H%M%S)"

# Known-good versions (Eclipse 2023-03 / Xtext 2.30.0)
GOOD_VERSIONS=(
  "org.eclipse.xtend.lib:2.30.0.v20230227-1111"
  "org.eclipse.xtend.lib.macro:2.30.0.v20230227-1111"
  "org.eclipse.xtext.xbase.lib:2.30.0.v20230227-1111"
  "com.google.guava:30.1.0.v20221112-0806"
  "com.google.inject:5.0.1.v20221112-0806"
  "org.eclipse.emf.mwe.core:1.8.0.v20221117-1134"
  "org.eclipse.emf.mwe.utils:1.8.0.v20221117-1134"
  "org.eclipse.emf.mwe2.runtime:2.14.0.v20221117-1134"
)

# Bundles to REMOVE if present (auto-updated versions that break resolution)
BAD_SYMLINKS=(
  "org.eclipse.xtend.lib"
  "org.eclipse.xtend.lib.macro"
  "org.eclipse.xtext.xbase.lib"
  "com.google.guava"
  "com.google.guava.failureaccess"
  "com.google.inject"
  "org.eclipse.emf.mwe.core"
  "org.eclipse.emf.mwe.utils"
  "org.eclipse.emf.mwe2.runtime"
)

echo "PCM: $PCM_APP"
echo "Backup: $BACKUP_DIR"
mkdir -p "$BACKUP_DIR"
cp "$BUNDLES_INFO" "$BACKUP_DIR/bundles.info.bak"

# --- Step 1: Remove bad versions ---
echo ""
echo "=== Step 1: Removing auto-updated bundles ==="
for symname in "${BAD_SYMLINKS[@]}"; do
  # Find jars that DON'T match the good version
  for jar in "$PLUGINS/$symname"*.jar; do
    [ -f "$jar" ] || continue
    basename "$jar"
  done
done

# --- Step 2: Restore good jars ---
# Good jars should already be on disk (Eclipse keeps old versions).
# We just need to remove the bad ones.
echo ""
echo "=== Step 2: Cleaning bad jars ==="
for jar in "$PLUGINS"/org.eclipse.xtend.lib_*.jar \
           "$PLUGINS"/org.eclipse.xtend.lib.macro_*.jar \
           "$PLUGINS"/org.eclipse.xtext.xbase.lib_*.jar \
           "$PLUGINS"/com.google.guava_*.jar \
           "$PLUGINS"/com.google.guava.failureaccess_*.jar \
           "$PLUGINS"/com.google.inject_*.jar \
           "$PLUGINS"/org.eclipse.emf.mwe.core_*.jar \
           "$PLUGINS"/org.eclipse.emf.mwe.utils_*.jar \
           "$PLUGINS"/org.eclipse.emf.mwe2.runtime_*.jar; do
  [ -f "$jar" ] || continue
  jar_name=$(basename "$jar")
  # Check if there's a version 2.43.0, 33.x, 7.0.0, 1.20.0, 2.26.0 pattern
  if echo "$jar_name" | grep -qE "_(2\.43\.0\.|33\.|7\.0\.0,|1\.20\.0\.|2\.26\.0\.)"; then
    echo "  Removing: $jar_name"
    mv "$jar" "$BACKUP_DIR/"
  fi
done

# Also handle the case where both 30.1.0 and 33.6.0 exist - keep 30.1.0
for jar in "$PLUGINS"/com.google.guava_*.jar; do
  [ -f "$jar" ] || continue
  if echo "$(basename "$jar")" | grep -q "33\.6\.0"; then
    echo "  Removing old Guava 33.x: $(basename "$jar")"
    mv "$jar" "$BACKUP_DIR/"
  fi
done

# --- Step 3: Fix bundles.info ---
echo ""
echo "=== Step 3: Fixing bundles.info ==="
BUNDLES_INFO_NEW="$BACKUP_DIR/bundles.info.fixed"
cp "$BUNDLES_INFO" "$BUNDLES_INFO_NEW"

# Remove entries for bad versions
for entry in "org.eclipse.xtend.lib,2.43.0" \
             "org.eclipse.xtend.lib.macro,2.43.0" \
             "org.eclipse.xtext.xbase.lib,2.43.0" \
             "com.google.guava,33.6.0.jre" \
             "com.google.guava.failureaccess" \
             "com.google.inject,7.0.0" \
             "org.eclipse.emf.mwe.core,1.20.0" \
             "org.eclipse.emf.mwe.utils,1.20.0" \
             "org.eclipse.emf.mwe2.runtime,2.26.0"; do
  grep -v "^$entry" "$BUNDLES_INFO_NEW" > "${BUNDLES_INFO_NEW}.tmp"
  mv "${BUNDLES_INFO_NEW}.tmp" "$BUNDLES_INFO_NEW"
done

# Check if good versions are already present; add if missing
declare -A GOOD_MAP
GOOD_MAP["org.eclipse.xtend.lib"]="org.eclipse.xtend.lib,2.30.0.v20230227-1111,plugins/org.eclipse.xtend.lib_2.30.0.v20230227-1111.jar,4,false"
GOOD_MAP["org.eclipse.xtend.lib.macro"]="org.eclipse.xtend.lib.macro,2.30.0.v20230227-1111,plugins/org.eclipse.xtend.lib.macro_2.30.0.v20230227-1111.jar,4,false"
GOOD_MAP["org.eclipse.xtext.xbase.lib"]="org.eclipse.xtext.xbase.lib,2.30.0.v20230227-1111,plugins/org.eclipse.xtext.xbase.lib_2.30.0.v20230227-1111.jar,4,false"
GOOD_MAP["com.google.guava"]="com.google.guava,30.1.0.v20221112-0806,plugins/com.google.guava_30.1.0.v20221112-0806.jar,4,false"
GOOD_MAP["org.eclipse.emf.mwe.core"]="org.eclipse.emf.mwe.core,1.8.0.v20221117-1134,plugins/org.eclipse.emf.mwe.core_1.8.0.v20221117-1134.jar,4,false"
GOOD_MAP["org.eclipse.emf.mwe.utils"]="org.eclipse.emf.mwe.utils,1.8.0.v20221117-1134,plugins/org.eclipse.emf.mwe.utils_1.8.0.v20221117-1134.jar,4,false"
GOOD_MAP["org.eclipse.emf.mwe2.runtime"]="org.eclipse.emf.mwe2.runtime,2.14.0.v20221117-1134,plugins/org.eclipse.emf.mwe2.runtime_2.14.0.v20221117-1134.jar,4,false"

for symname in "${!GOOD_MAP[@]}"; do
  if ! grep -q "^$symname," "$BUNDLES_INFO_NEW"; then
    echo "  Adding missing: $symname"
    echo "${GOOD_MAP[$symname]}" >> "$BUNDLES_INFO_NEW"
  fi
done

cp "$BUNDLES_INFO_NEW" "$BUNDLES_INFO"

# --- Step 4: Clean OSGi cache ---
echo ""
echo "=== Step 4: Cleaning OSGi cache ==="
rm -rf "$PCM_APP/Contents/Eclipse/configuration/org.eclipse.osgi"

echo ""
echo "=== Done ==="
echo "Backup in: $BACKUP_DIR"
echo "Run PCM with -clean flag to rebuild the bundle cache."
