# Use an official Maven image with OpenJDK
FROM maven:3.8.4-openjdk-17-slim AS build

# Set working directory inside the container
WORKDIR /app

# Metadata labels
LABEL maintainer="George <georgejames123@yahoo.com>"
LABEL version="1.0.0"
LABEL description="Spring Boot API Docker image for testing"
LABEL org.opencontainers.image.source="https://github.com/georgejames123/IJ_springboot_api"
LABEL org.opencontainers.image.licenses="NA"
LABEL org.opencontainers.image.created="$(date -u +'%Y-%m-%dT%H:%M:%SZ')"
LABEL org.opencontainers.image.revision="git-commit-sha"

# Copy project files
COPY pom.xml ./
COPY src ./src

# Build the application inside the container
RUN mvn clean package

# Use a minimal JDK image for running the app
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built JAR file from the Maven build stage
COPY --from=build /app/target/springapi-0.0.1-SNAPSHOT.jar /app/springapi.jar

# Run the application
CMD ["java", "-jar", "/app/springapi.jar"]