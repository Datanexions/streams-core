#!/bin/bash

# Streams Core 1.0.0
# Core interfaces and configuration classes for the Streams by Datanexions data processing framework.
# This module provides foundational support for source connectors, authentication, and connection metadata.

set -e

VERSION="1.0.0"
ARTIFACT="streams-core"
GROUP_ID="com.datanexions"
GROUP_PATH="com/datanexions"
TARGET_DIR="target"
STAGING_DIR="repo/${GROUP_PATH}/${ARTIFACT}/${VERSION}"
ZIP_NAME="${ARTIFACT}-bundle.zip"

ARTIFACTS=(
  "${ARTIFACT}-${VERSION}.jar"
  "${ARTIFACT}-${VERSION}-sources.jar"
  "${ARTIFACT}-${VERSION}-javadoc.jar"
  "${ARTIFACT}-${VERSION}.pom"
)

# Cleanup previous outputs
rm -rf $TARGET_DIR/*.asc $TARGET_DIR/*.md5 $TARGET_DIR/*.sha1
rm -rf repo $ZIP_NAME test.txt.gpg

# Unlock GPG key
gpgconf --launch gpg-agent
gpg --pinentry-mode loopback --sign test.txt

# Build and sign
mvn clean verify -P release

# Ensure POM is signed
gpg --yes --armor --detach-sign --pinentry-mode loopback "${TARGET_DIR}/${ARTIFACT}-${VERSION}.pom"

# Generate checksums and validate
for file in "${ARTIFACTS[@]}"; do
  fullpath="${TARGET_DIR}/${file}"

  # Generate checksums
  md5sum "$fullpath" | awk '{print $1}' > "$fullpath.md5"
  sha1sum "$fullpath" | awk '{print $1}' > "$fullpath.sha1"

  # Verify MD5
  echo "$(cat "$fullpath.md5")  $fullpath" | md5sum -c -

  # Verify SHA1
  echo "$(cat "$fullpath.sha1")  $fullpath" | sha1sum -c -
done

# Copy artifacts to Maven Central-compliant structure
mkdir -p "$STAGING_DIR"
for file in "${ARTIFACTS[@]}"; do
  cp "${TARGET_DIR}/${file}" "$STAGING_DIR/"
  cp "${TARGET_DIR}/${file}.asc" "$STAGING_DIR/"
  cp "${TARGET_DIR}/${file}.md5" "$STAGING_DIR/"
  cp "${TARGET_DIR}/${file}.sha1" "$STAGING_DIR/"
done

# Create ZIP with Maven-compatible structure
cd repo
zip -r "../$ZIP_NAME" com/
cd ..

echo "✅ $ZIP_NAME is ready for Central Publishing Portal."
echo "🧪 All checksums were verified successfully."
echo "📤 Upload to: https://central.sonatype.com > your project > Publish > Manual Upload"