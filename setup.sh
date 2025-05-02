#!/bin/sh

# Compiles module to jar files
echo "Compiling modules with maven"
mvn clean package

# Create the libs directory if it doesn't exist
mkdir -p libs

# Define an array of module directories
modules=(
  "application"
  "menuconsumer"
  "menuprovider"
  "menuservice"
  "passwordconsumer"
  "passwordprovider"
  "passwordservice"
)

# Loop through each module and copy JAR files to libs
for module in "${modules[@]}"; do
  cp ./"$module"/target/*.jar ./libs/
done

echo "All JAR files have been copied to libs!"
