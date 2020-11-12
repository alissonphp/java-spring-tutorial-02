# Java Tutorials: #02 Data persistence
#### Main goal:

- Setup JPA and MySQL connector
- Create a USER entity
- Create UserRepository to CRUD methods
- Create a Controller with 2 routes (store and list)
- Persist a new user in database
- List all users in database

#### MySQL Instance
Run a container with
```shell script
docker run --name tutorial -p 3306:3306 -e MYSQL_ROOT_PASSWORD=pass123 -e MYSQL_USER=tutorial -e MYSQL_PASSWORD=pass123 -e MYSQL_DATABASE=tutorial -d mysql:5.6
```
#### References:

- [spring guide](https://spring.io/guides/gs/accessing-data-mysql/)

#### Results:
store new
```shell script
> curl -X POST http://localhost:8080/user -d "name=Alisson&email=alisson.php@gmail.com"
new user stored
```
list all
```shell script
> curl http://localhost:8080/user
[
    {
        "id":1,
        "name":"Alisson",
        "email":"alisson.php@gmail.com"
    }
]
```