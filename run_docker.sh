#!/bin/sh
CONTAINER_RUNNING=$(docker ps --filter "ancestor=my-java-app" --format "{{.ID}}")

# Default: No Maven build unless `--compile` or `-c` is provided
COMPILE=false
for arg in "$@"; do
  if [ "$arg" == "--compile" ] || [ "$arg" == "-c" ]; then
    COMPILE=true
    break
  fi
done

# Run Maven build only if `--compile` or `-c` is passed
if [ "$COMPILE" == "true" ]; then
  echo "Building all modules with Maven..."
  mvn clean package
else
  echo "Skipping Maven build..."
fi


if [ -n "$CONTAINER_RUNNING" ]; then
  echo "Container using 'my-java-app' is already running. Skipping build."
else
  # Check if the image exists
  IMAGE_EXISTS=$(docker images -q my-java-app)

  if [ -z "$IMAGE_EXISTS" ]; then
    echo "Building Docker image..."
    docker build -t my-java-app .
  else
    echo "Skipping Docker build, image already exists."
  fi
fi

echo "Running container..."
docker run --rm -it my-java-app
