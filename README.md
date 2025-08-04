# 📝 Blogging Platform API

A simple RESTful API built with Spring Boot that allows users to manage blog posts. It supports basic CRUD operations and comes with Swagger UI for easy testing and documentation.

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- MySQL
- Maven
- Swagger (via springdoc-openapi)
- Postman (for API testing)

## 📦 How to Run Locally

### 1. Clone the Repository

```bash
git clone https://github.com/Botboy678/Blogging-Platform-API.git
cd Blogging-Platform-API
```
### 2. Create a MySQL database
```sql
CREATE DATABASE blogdb;
```

### 3. Creating and Configuring MySQL Dependencies 
### Create the application.properties file at: 
```css
src/main/resources/application.properties
```
### And then you need to add your own DB configs 
### The default port is 3306 for MySQL test your DB connection to see
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/blogdb 
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```

### 4. Run the app 

```bash
./mvnw spring-boot:run
```
### Or you can just navigate to and use IntelliJ's run button: 
```properties
src/main/java/com/blogging/RESTAPI/BloggingPlatformApiApplication.java
```

### 5. Open Swagger UI

```bash
http://localhost:8080/swagger-ui.html
```
### You can test all endpoints there.
### Example: 
<img width="957" height="966" alt="image" src="https://github.com/user-attachments/assets/8e209a00-9760-4f81-9ee5-eefbd3707d51" />

### 🧪 API Testing with Postman
You can also use Postman to test the API manually. Just make sure your server is running 
