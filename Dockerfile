FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

# Copy all jar files in project to app/libs
COPY */target/*.jar /app/libs/

# Ensures that script is loaded
COPY run.sh /app/run.sh

# Install dependencies & set script permissions at the end
#RUN apk add --no-cache bash && chmod +x /app/run.sh
RUN chmod +x /app/run.sh

# Ensure the application runs interactively
ENTRYPOINT ["/bin/sh","-i" ,"-c", "exec /app/run.sh"]
