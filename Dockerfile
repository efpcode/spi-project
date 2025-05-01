FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

# Install dependencies
RUN apk add --no-cache bash


# Copy necessary files
COPY setup.sh /app/setup.sh
COPY run.sh /app/run.sh
COPY . /app

# Ensure scripts have execution permissions
RUN chmod +x /app/setup.sh /app/run.sh

# Run setup once during the build process
RUN /app/setup.sh

# Force interactive mode by using a shell as ENTRYPOINT
ENTRYPOINT ["/bin/bash","-c", "/app/run.sh"]
