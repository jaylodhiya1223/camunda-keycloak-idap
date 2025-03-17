# Camunda Keycloak Identity Integration

This module is designed to integrate Camunda BPM with Keycloak for authentication and authorization. It enables user authentication using OAuth2 and allows secure access to the Camunda web interface.

## Project Structure
The project is organized as a **Maven-based** Spring Boot application:
- config → Contains Keycloak and Spring Security configuration.
- controllers → Handles REST API endpoints.
- services → Contains business logic.
- resources → Includes application configuration and BPMN process definitions.

## Prerequisites
- Java version 17
- Maven
- 

## Building the JAR File
1. To build the JAR file for the application, run:
   ```sh
   mvn clean install
   ```

## Running the Application
1. Ensure **Keycloak** is running on `http://localhost:8080`
2. Start the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

## Building Project
1. Execute the following command to run unit tests:
   ```sh
   mvn clean install
   ```

## Authentication Flow
1. User accesses `http://localhost:8084/camunda`
2. Redirects to **Keycloak login**.
3. After successful login, Camunda is accessible.
