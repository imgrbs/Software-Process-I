# Software Process I : Spring Demo Application

## Installation

To run project, please setup your database first!

1. create database.
> I prefer to use `promptkai` :D
2. import promptkai.sql to your database.
3. change value in `application.properties` with your database name, username and password.

### Example
```
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://{your.db.url}/promptkai
spring.datasource.username={your-db-username}
spring.datasource.password={your-db-password}
```

> Note: Do not try to access my database if you do not want to waste your time. 😆

## Run !
if you have done the installation, you can open a html file in `frontend/index.html` and see a result.
