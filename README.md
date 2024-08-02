# Workshop Spring Boot 3 JPA

## Overview

Welcome to the **Workshop Spring Boot 3 JPA** project! This project is designed to demonstrate the use of modern Java technologies for building a robust and scalable application. The focus is on managing products, orders, and payments, leveraging a variety of technologies and tools to create a comprehensive solution.

## Technologies

- **Java 17**: The latest version of Java for modern development.
- **Maven**: Dependency management and build automation tool.
- **Spring Boot 3**: Framework for building stand-alone, production-grade Spring-based applications.
- **H2 Database**: Lightweight in-memory database for development and testing.
- **PostgreSQL**: Powerful, open-source object-relational database for production use.
- **Apache Tomcat**: Servlet container for deploying Java web applications.
- **Heroku**: Cloud platform for deploying and managing applications.
- **Postman**: API client for testing and interacting with the application's endpoints.

## Features

- **Product Management**: CRUD operations for product entities.
- **Order Management**: Creation, retrieval, update, and deletion of orders.
- **Payment Processing**: Handling payments associated with orders.

## Getting Started

### Prerequisites

- **Java 17** installed on your machine.
- **Maven** installed for building the project.
- **PostgreSQL** set up if you want to use it for production.
- **Heroku CLI** for deployment.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/josivantarcio/workshop-springboot3-jpa.git
   ```

2. Navigate to the project directory:

   ```bash
   cd workshop-springboot3-jpa
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

### Configuration

- **Application Properties**: Configure the application properties in `src/main/resources/application.properties`.
- **Database Configuration**: Set up your PostgreSQL database connection details if needed.
- **Heroku Deployment**: Follow Heroku's documentation for deploying Java applications.

### API Testing

Use **Postman** to interact with the API endpoints provided by the application. The base URL for local testing is `http://localhost:8080`.

### Example Endpoints

- **GET /api/products**: Retrieve all products.
- **POST /api/products**: Create a new product.
- **GET /api/orders**: Retrieve all orders.
- **POST /api/orders**: Create a new order.
- **POST /api/payments**: Process a payment for an order.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

Special thanks to Professor [Nelio Alves](https://www.linkedin.com/in/nelioalves) for suggesting the project name and providing guidance.
