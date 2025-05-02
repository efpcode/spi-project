# Check if a container is already running using the 'my-java-app' image
$containerRunning = docker ps --filter "ancestor=my-java-app" --format "{{.ID}}"

# Default: No Maven build unless '--compile' or '-c' is provided
$compile = $false
foreach ($arg in $args) {
    if ($arg -eq "--compile" -or $arg -eq "-c") {
        $compile = $true
        break
    }
}

# Run Maven build only if '--compile' or '-c' is passed
if ($compile) {
    Write-Output "Building all modules with Maven..."
    mvn clean package
} else {
    Write-Output "Skipping Maven build..."
}

if ($containerRunning) {
    Write-Output "Container using 'my-java-app' is already running. Skipping build."
} else {
    # Check if the image exists
    $imageExists = docker images -q my-java-app

    if (-not $imageExists) {
        Write-Output "Building Docker image..."
        docker build -t my-java-app .
    } else {
        Write-Output "Skipping Docker build, image already exists."
    }
}

Write-Output "Running container..."
docker run --rm -it my-java-app
