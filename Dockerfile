# Stage 1: Runtime environment
FROM eclipse-temurin:17-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the jar file from the target folder to the container
# Note: Ensure your actual jar name matches or use a wildcard
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
