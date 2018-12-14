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
#### APIs

#### Listando todos Usuário:
GET http://localhost:8080/users

#### Criando um novo Usuário:
POST http://localhost:8080/users

###### request body:
```
{
    "name": "Lucas",
    "birthDate": "2010-12-05T11:19:21.213+0000"
}
```
#### Criando nova postagem para o Usuário 10002:
POST http://localhost:8080/users/10002/posts

###### request body:
```
{
    "description": "my new post"
}
```
#### Listagem de todas postagens do Usuário 10002:
GET http://localhost:8080/users/10002/posts

##### Excluindo o User 1:
DELETE http://localhost:8080/users/1

#### Caso deseje usar o client do Swagger para testar as APIs, acessar pelo browser a URL:

###### http://localhost:8080/swagger-ui.html
