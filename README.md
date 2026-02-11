#  Library Management System

A simple **Java Web Application** for managing books in a library.  
This project is developed using **Java Servlets, JDBC, HTML, and Oracle Database**.

---

##  Project Description

The Library Management System is a mini web-based project that allows users to:

- Add new books to the library  
- View book details using ISBN  
- Store and retrieve book and author information from Oracle database  

The project follows a structured architecture with:

- Servlets for request handling  
- DAO layer for database operations  
- Service layer for business logic  
- Java Beans for data transfer  

---

##  Features

### ✔ Add Book
- Enter ISBN, Book Name, Type, Author, and Cost  
- Validates input before saving  
- Stores data in Oracle Database  

### ✔ View Book
- Search book using ISBN  
- Displays complete book and author details  

### ✔ Database Connectivity
- Uses JDBC to connect Java with Oracle DB  
- Data stored in relational tables  

---

##  Technologies Used

- Java (Servlets & JDBC)
- Oracle Database
- HTML
- Apache Tomcat Server
- Eclipse IDE

---

##  Project Modules

### Packages

- `com.wipro.book.bean` – Contains BookBean and AuthorBean  
- `com.wipro.book.dao` – Handles database operations  
- `com.wipro.book.service` – Business logic  
- `com.wipro.book.servlets` – Web controllers  
- `com.wipro.book.util` – Database connection utility  

---

##  Database Schema

### AUTHOR_TBL

```sql
CREATE TABLE AUTHOR_TBL(
    AUTHOR_CODE NUMBER(5) PRIMARY KEY,
    AUTHOR_NAME VARCHAR2(20) NOT NULL,
    CONTACT_NO NUMBER(10)
);

<img width="379" height="183" alt="image" src="https://github.com/user-attachments/assets/26d4c8c7-90ea-4893-8196-a89e7cab6afb" />
<img width="401" height="349" alt="image" src="https://github.com/user-attachments/assets/47b0639e-6435-48c8-9e67-12ca4baf01f5" />
<img width="602" height="238" alt="image" src="https://github.com/user-attachments/assets/d059b2d4-9846-4317-a597-4db5279ac1c8" />
<img width="390" height="209" alt="image" src="https://github.com/user-attachments/assets/93812135-7813-485f-9456-65f0422e3f05" />


