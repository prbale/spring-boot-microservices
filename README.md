# Spring Boot Microservices Example

This repository contains a sample project demonstrating the implementation of microservices architecture using Spring Boot.

[Refer blog on Microservices here](https://prashbale.hashnode.dev/kickstart-your-journey-building-your-first-microservice-with-spring-boot).

## Overview
Explain briefly what the project is about and what its goals are. Highlight the main features and functionalities.

## Technologies Used
List the key technologies and frameworks used in the project. For example:

- Spring Boot
- Spring Cloud
- H2 DB
- Maven for dependency management

## Modules

Describe the modules or services included in the project. For example:

- user-service: Example microservice handling user-related operations.
- order-service: Example microservice managing orders.

## Setup

Provide instructions on how to set up and run the project locally. Include prerequisites and steps to follow. For example:

1. Prerequisites:

- Java 17+
- Maven 3.x
- H2 database

2. Clone the repository:

```
git clone https://github.com/prbale/spring-boot-microservices.git
cd spring-boot-microservices
```


3. Build and run using Maven:

```
mvn clean install
```

4. Accessing services:

- User Service: http://localhost:8080
- Order Service: http://localhost:8081

## Usage
Provide examples or instructions on how to use the services/APIs provided by your microservices. 
For example:

- Creating a User:

```
curl -X POST http://localhost:8080/users -d '{"name":"john_doe","email":"john.doe@example.com"}' -H "Content-Type: application/json"
```

- Placing an Order:

```
curl -X POST http://localhost:8080/orders -d '{"userId":1,"product":"Macbook"}' -H "Content-Type: application/json"
```

## Contributing
Provide guidelines if you want others to contribute to your project. For example, how to raise issues, submit pull requests, or any coding standards to follow.

## License
Specify the license under which the project is distributed. For example, MIT License, Apache License 2.0, etc.

