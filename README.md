# Software Process I : Spring Demo Application

## System Requirement
- java 8 with *Java Home* in Local Environment
- maven 3.5.*
- google chrome Version 68.*

## Installation

### *Step 1*: Setup Database
To run project, please setup your database first!

1. create database.
> I prefer to use database name `promptkai` :D
2. import promptkai.sql to your database.
3. replace value in `application.properties` with your database name, username and password.

### Example
```
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://{your.db.url}/promptkai
spring.datasource.username={your-db-username}
spring.datasource.password={your-db-password}
```

> Note: Do not try to access my database if you do not want to waste your time. 😆

### *Step 2*: Install Dependencies

1. Open `CMD/Power Shell` or `Terminal` with *Project Directory*.
2. Use command to open `api` directory such as `cd ./api`.
3. Use command `mvn clean package` to install maven package.
4. Finish!


## Run and Enjoy 🎉 

1. Use command to open `api` directory such as `cd ./api`.
2. Use command `java -jar ./target/*.jar` to run *.jar* file.

if no error occurs, you can open a html file in `frontend/index.html` and see a result.
