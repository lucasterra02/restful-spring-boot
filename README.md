# restful-spring-boot

### CRUD utilizando WebServices RESTful com Spring Framework

##### Stack: 

Java 8,
Spring Boot 2.0.7,
Maven 3.5.3,
H2 Database Engine,
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

##### Listando todos Users:
GET http://localhost:8080/users

#### Criando um novo User:
POST http://localhost:8080/users

###### request body:
```
{
    "name": "Lucas",
    "birthDate": "2010-12-05T11:19:21.213+0000"
}
```
#### Criando nova postagem para o User 10002:
POST http://localhost:8080/users/10002/posts

###### request body:
```
{
    "description": "my new post"
}
```
#### Listagem de todas postagens por Usuário 10002:
GET http://localhost:8080/users/10002/posts

##### Excluindo o User 1:
DELETE http://localhost:8080/users/1
