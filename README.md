# Spring Boot CRUD Application

A simple CRUD (Create, Read, Update, Delete) application built using Spring Boot and H2 Database.

## Features

* Create User
* Read User
* Update User
* Delete User
* H2 Database Integration
* REST APIs


## H2 Database Console

Access the database in your browser:

```text
http://localhost:8080/h2-console
```

**JDBC URL**

```text
jdbc:h2:mem:testdb
```

**Username**

```text
sa
```

**Password**

```text
(leave blank)
```

## API Endpoints

### Create User

```http
POST http://localhost:8080/register
```

```json
{
  "userId": 1001,
  "username": "aayush mani",
  "email": "aayush@gmail.com",
  "age": 22,
  "gender": "male"
}
```

### Read User

```http
GET http://localhost:8080/readUser/1001
```

### Update User

```http
PUT http://localhost:8080/updateUser/1001
```

```json
{
  "username": "aayush updated",
  "email": "updated@gmail.com",
  "age": 23,
  "gender": "male"
}
```

### Update Username Only

```http
PATCH http://localhost:8080/updateUser/1001
```

Request Body:

```text
Aayush Supermani
```

### Delete User

```http
DELETE http://localhost:8080/deleteUser/1001
```

## Run the Application

```bash
mvn spring-boot:run
```

Application starts at:

```text
http://localhost:8080
```

---

Built for learning Spring Boot CRUD operations and REST APIs.
