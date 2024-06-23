# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host to the container
COPY target/spring-boot-hello-world-example-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot app runs on
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]

