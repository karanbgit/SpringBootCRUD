# Spring Boot CRUD Application – College Management System

This is a simple **Spring Boot CRUD REST API** project developed for managing student data in a college.  
The project demonstrates how to implement basic **Create, Read, Update, and Delete (CRUD)** operations using **Spring Boot, Spring Web, JPA (Hibernate), and MySQL**.

---

## 🚀 Features

- Add New Student  
- Get Student by ID  
- Get All Students  
- Update Student  
- Delete Student  
- Pure REST API (JSON Responses)  
- Uses Spring Boot, JPA, Hibernate  
- MySQL Database Integration  

---

## 🛠️ Tech Stack

- Java  
- Spring Boot  
- Spring Web (REST API)  
- Spring Data JPA (Hibernate)  
- MySQL Database  
- Maven  

---

## 📁 Project Structure

College/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/yourpackage/college/
│ │ │ ├── controller/
│ │ │ ├── service/
│ │ │ ├── repository/
│ │ │ ├── entity/
│ │ │ └── CollegeApplication.java
│ │ └── resources/
│ │ └── application.properties
├── pom.xml
└── README.md



---

## ⚙️ Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/college
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
