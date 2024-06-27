# Microservices with Spring Cloud

This repository contains a sample project to demonstrate how to create a microservices environment from scratch in Java using Spring Boot and Spring Cloud. It includes two microservices with a basic setup for service discovery and API gateway.


## Overview

Microservices architecture allows building scalable and maintainable applications by breaking them down into smaller, independent services. This project showcases the essential components of Spring Cloud:
- **Spring Eureka**: For service registration and discovery.
- **Spring Cloud Gateway**: For routing and managing API requests.

## Project Structure

The project consists of three main components:

1. **Discovery Server** (Spring Eureka)
2. **Service1** & **Service2**: A simple microservice with one endpoint `/hello`
3. **Gateway Server** (Spring Cloud Gateway): Routes requests to Service A

[LICENSE](LICENSE)
