FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

## Install dependencies
RUN apk add --no-cache bash


# Copy necessary files
COPY . /app

# Ensure scripts have execution permissions
RUN chmod +x /app/setup.sh /app/run.sh && /app/setup.sh

# Ensure the application runs interactively
ENTRYPOINT ["/bin/bash","-i" ,"-c", "exec /app/run.sh < /dev/tty"]
