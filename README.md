#     SpringBoot-Museum-Catalog

A **Spring Boot 2.7** web application for managing a museum catalog.  
Built with **Java 17**, **Thymeleaf**, **Spring Data JPA**, **Spring Security**, and **PostgreSQL**.

---

## Features
- CRUD for catalog domain (exhibits, artists, collections, etc.)
- Responsive views with **Thymeleaf**
- Persistent storage in **PostgreSQL** via **JPA/Hibernate**
- Authentication & role-based authorization with **Spring Security**
- Hot reload support using **DevTools**

---

## Tech Stack
- **Backend:** Spring Boot (Web, Data JPA, Security)  
- **Frontend:** Thymeleaf + Thymeleaf Security Extras  
- **Database:** PostgreSQL  
- **Build Tool:** Maven (`spring-boot-maven-plugin`)  
- **Language:** Java 17  

---
Project Structure
```text
src/main/java/com/catalog_museum
 ├─ controller/      # Web controllers (routes)
 ├─ service/         # Business logic
 ├─ repository/      # Spring Data JPA repositories
 ├─ entity/          # JPA entities
 └─ config/          # Security & app config
src/main/resources
 ├─ templates/       # Thymeleaf views
 └─ static/          # CSS/JS/images
```


## Setup

1. **Database**
   ```sql
   CREATE DATABASE museumdb;
Edit 
 src/main/resources/application.properties:
 ```java
  spring.datasource.url=jdbc:postgresql://localhost:5432/museumdb
  spring.datasource.username=postgres
  spring.datasource.password=YOUR_PASSWORD
  spring.jpa.hibernate.ddl-auto=update
```
2. Build & Run
  ./mvnw spring-boot:run
