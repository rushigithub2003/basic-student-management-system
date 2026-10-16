# Basic Student Management System

A beginner-friendly Student Management System built using Java and Spring Boot. This project demonstrates REST API development and database operations using Spring Data JPA and Hibernate.

## Features

- Add a student.
- Retrieve a student by ID.
- Delete a student by ID.
- Delete all students.
- Store student information in a database.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

## Student Properties

| Property | Data Type |
| -------- | --------- |
| id       | int       |
| name     | String    |
| email    | String    |
| address  | String    |
| course   | String    |
| age      | int       |

## API Endpoints

| HTTP Method | Endpoint        | Description              |
| ----------- | --------------- | ------------------------ |
| POST        | `/student`      | Add a student            |
| GET         | `/student/{id}` | Retrieve a student by ID |
| DELETE      | `/student/{id}` | Delete a student by ID   |
| DELETE      | `/student`      | Delete all students      |

## Example Request

### Add a Student

**Method:** `POST`

**Endpoint:** `/student`

**Request Body:**

```json
{
  "name": "Rahul Sharma",
  "email": "rahul@example.com",
  "address": "Pune",
  "course": "Java Full Stack",
  "age": 22
}
```

### Example Response

```text
Student Added.
```

## Project Structure

```text
basic-student-management-system/
├── src/
│   └── main/
│       └── java/
│           └── com/example/student/
│               ├── entity/
│               │   └── Student.java
│               ├── repository/
│               │   └── StudentRepo.java
│               ├── service/
│               │   └── StudentService.java
│               └── controller/
│                   └── StudentController.java
├── src/main/resources/
│   └── application.properties
├── .gitignore
├── pom.xml
└── README.md
```

## How to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/rushigithub2003/basic-student-management-system.git
   ```

2. Open the project in Spring Tool Suite (STS).

3. Configure your PostgreSQL database connection in `application.properties`.

4. Ensure that PostgreSQL is running and the database is configured correctly.

5. Run the Spring Boot application.

6. Test the API endpoints using Postman.

## Learning Objectives

- Practise Spring Boot REST API development.
- Understand Entity, Repository, Service, and Controller layers.
- Learn basic database operations using Spring Data JPA.
- Understand how Spring Boot interacts with a relational database.
- Strengthen Java backend development skills.

## Future Improvements

- Implement an API to retrieve all students.
- Add exception handling.
- Add request validation.
- Improve API responses.
- Write unit tests.

## Author

**Rushikesh Dhole**

GitHub: https://github.com/rushigithub2003

---

This project is part of my ongoing Java and Spring Boot practice journey.
