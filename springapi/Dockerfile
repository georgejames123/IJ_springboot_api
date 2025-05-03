# Use an official Maven image with OpenJDK
FROM maven:3.8.4-openjdk-17-slim AS build

# Set working directory inside the container
WORKDIR /app

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