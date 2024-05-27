# Registration and Login System

This repository contains a Registration and Login System built using Spring Boot. This system provides a secure way for users to register and log in to an application. It includes features such as user authentication, registration with email verification, and password encryption.

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
- [Endpoints](#endpoints)
- [License](#license)

## Features
- User registration with email verification
- User login with JWT authentication
- Password encryption using BCrypt
- Role-based access control
- Custom error handling
- RESTful API design

## Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
- A database (H2, MySQL, PostgreSQL, etc.)

## Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/musalsouqi/Registration-and-Login-System.git
   cd Registration-and-Login-System
   ```

2. **Configure the database:**
   Update the `application.properties` file with your database configuration.

3. **Build the project:**
   ```sh
   mvn clean install
   ```

4. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

## Usage
After running the application, you can use tools like Postman or cURL to interact with the API. The following endpoints are available:

### Registration
- **POST /api/auth/register**
  - Request Body:
    ```json
    {
      "username": "exampleUser",
      "password": "examplePass",
      "email": "user@example.com"
    }
    ```
  - Response:
    ```json
    {
      "message": "User registered successfully. Please check your email for verification."
    }
    ```

### Email Verification
- **GET /api/auth/verify?token=yourVerificationToken**
  - Response:
    ```json
    {
      "message": "Email verified successfully."
    }
    ```

### Login
- **POST /api/auth/login**
  - Request Body:
    ```json
    {
      "username": "exampleUser",
      "password": "examplePass"
    }
    ```
  - Response:
    ```json
    {
      "token": "your.jwt.token.here"
    }
    ```

## Project Structure
The project structure follows the standard Spring Boot conventions:
```
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── registrationlogin
│   │               ├── controller
│   │               ├── model
│   │               ├── repository
│   │               ├── service
│   │               └── RegistrationLoginApplication.java
│   └── resources
│       ├── static
│       ├── templates
│       ├── application.properties
│       └── schema.sql
└── test
    └── java
        └── com
            └── example
                └── registrationlogin
```

## Configuration
- **application.properties:**
  Configure your database settings and other application properties.
  ```properties
  spring.datasource.url=jdbc:h2:mem:testdb
  spring.datasource.username=sa
  spring.datasource.password=password
  spring.jpa.hibernate.ddl-auto=update
  jwt.secret=yourSecretKey
  ```

## Endpoints
- **/api/auth/register**: User registration
- **/api/auth/verify**: Email verification
- **/api/auth/login**: User login
- **/api/user/**: User-specific endpoints (protected)

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Feel free to contribute to this project by submitting issues or pull requests. For any questions or support, please contact [Musalsouqi@gmail.com].
