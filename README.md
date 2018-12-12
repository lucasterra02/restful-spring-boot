# restful-spring-boot

### CRUD utilizando WebServices RESTful com Spring Framework

##### Stack: 

Java 8

Spring Boot 2.0.7

Maven 3.5.3

H2 Database Engine

Swagger 2

##### Maven Build:
```
mvn clean install
```
##### Start da aplicação:
```
mvn clean spring-boot:run
```
##### Operações:

GET http://localhost:8080/users

POST http://localhost:8080/users

###### exemplo de request body:
```
{
    "name": "Lucas",
    "birthDate": "2010-12-05T11:19:21.213+0000"
}
```

POST http://localhost:8080/users/10002/posts

###### exemplo de request body:
```
{
    "description": "my first post"
}
```

DELETE http://localhost:8080/users/1
