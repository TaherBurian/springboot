# official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY target/test-0.0.1-SNAPSHOT.jar /app

# Specify the command to run on container startup
CMD ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]