
# API Creation for ToDo Application with User Using Springboot and MYSQL.
This project is developed using JAVA V-17.0.8 and Springboot.

Text editor used: INTELLIJ.

Project: Maven based project.
## 🛠 Skills
------------      
    - Springboot
    - Java
    - JPA 
    - MYSQL
## OverView of the project:
---------------------------
    Here,We create the backend process to store the data's in Database, it can be accessed through (@RestController) : @RequestMapping, Mapping Methods(GET,PUT,POST,DELETE)

    And In this , we also added a user model for login and register to the application. which can be accesed through api in the front-end.

    In this Project, for the backend Database: I used JPA and MySQL.

    
## Project Structure
⏩Models:
   - Todo
   - User
⏩Controller:
   - TodoController
   - UserController
⏩Repository:
   - TodpRepository
   - UserRepository
⏩Request:
   - TodoRequest

         This is to get the task todo from the user and add to the database.
⏩Service:
   - TodoService
   - UserService

⏩Application Properties:
      
       In this, I have added all the database related queries which will be runned when the server starts.

## Dependencies Used
1. spring-boot-starter-web
2. mysql-connector-java
3. spring-boot-starter-data-jdbc
4. spring-boot-starter-data-jpa
5. spring-boot-starter-validation
6. lombok
7. spring-boot-devtools


## Plugins Used
   - spring-boot-maven-plugin
---------------------------------

 
