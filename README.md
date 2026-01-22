# Employee Management System

A professional backend application built using *Spring Boot* to manage employee data securely and efficiently.

---

## 🚀 Features

- Employee CRUD Operations (Create, Read, Update, Delete)
- RESTful APIs
- Layered Architecture (Controller, Service, Repository)
- JWT-based Authentication & Authorization
- Global Exception Handling
- Input Validation

---

## 🛠️ Tech Stack

- Java 8
- Spring Boot
- Spring Security (JWT)
- Hibernate / JPA
- Maven
- MySQL
- IntelliJ IDEA

---

## 📂 Project Structure

src  
└── main  
&nbsp;&nbsp;&nbsp;&nbsp;├── java  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;└── com.gnaneswar.employeemanagementsystem  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── controller  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── service  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── repository  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── entity  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── dto  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── security  
&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── exception  
&nbsp;&nbsp;&nbsp;&nbsp;└── resources  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── application.properties

---

## ⚙️ How to Run the Project

1. Clone the repository

   git clone https://github.com/Gnaneswar-Babu/employee-management-system.git

2. Open the project in IntelliJ IDEA

3. Update database configuration in application.properties

4. Run the main class:  
   EmployeeManagementSystemApplication.java
---
## 🧠 Implementation Details

This project follows a clean and scalable backend architecture.

### Implemented Modules

- *Employee Module*
    - Create Employee
    - Get Employee by ID
    - Get All Employees
    - Update Employee Details
    - Delete Employee

- *Security Module*
    - JWT-based authentication
    - Role-based authorization
    - Secured APIs using Spring Security filters

- *Exception Handling*
    - Centralized global exception handling
    - Custom exception classes
    - Meaningful HTTP status codes

- *DTO & Validation*
    - DTO pattern to avoid exposing entities
    - Input validation using annotations

- *Persistence Layer*
    - JPA repositories
    - Hibernate ORM mapping
    - Database interaction using MySQL
---

## 🔐 Security

- JWT-based authentication
- Role-based authorization
- Secured REST endpoints

---

## 📌 Project Status

- ✅ Backend implementation completed
- 🚧 Enhancements in progress (Swagger, Pagination, Docker)

---

## 👨‍💻 Author

*Gnaneswar Babu*  
Java Backend Developer
