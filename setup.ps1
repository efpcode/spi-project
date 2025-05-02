# Compiles module to JAR files
Write-Host "Compiling modules with Maven"
mvn clean package

# Create the libs directory if it doesn't exist
if (!(Test-Path -Path "libs" -PathType Container)) {
    New-Item -ItemType Directory -Path "libs"
}

# Define an array of module directories
$modules = @(
    "application",
    "menuconsumer",
    "menuprovider",
    "menuservice",
    "passwordconsumer",
    "passwordprovider",
    "passwordservice"
)

# Loop through each module and copy JAR files to libs
foreach ($module in $modules) {
    Copy-Item "$module\target\*.jar" -Destination "libs\" -Force
}

Write-Host "All JAR files have been copied to libs!"
