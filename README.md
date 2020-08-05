# workshop06-RESTful-api
## init project :
```
>> gradlew
 รอจน build successful
>> gradlew test 
มันจะโหลด libraries เยอะ(ครั้งเดียว) รอจน build successful

```
## Build 
```
>> gradlew bootRun
การ start web server ของ spring boot 
จะ error ที่ถูกต้องสำหรับการรันครั้งแรก

```

##  Production RUN (.Jar) 
```
>> gradlew bootJar 
>> gradlew clean bootJar 
```

#### RUN (.Jar) 
```
เข้า folder \libs
>> java -jar //path
>> java -jar build\libs\demo-0.0.1-SNAPSHOT.jar
```

##### Notice : Build fail : check your java version
```
>> javac -version
>> set JAVA_HOME=<PATH java>
```


#### Let's start
reference doc : https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/html/

Open url=http://localhost:8080/ in a web browser


```

## Resources
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

#### STEP 1 : Get all users   (branch step01)
+ http://localhost:8080/users
```
GET /users
Response code = 200
[
	{
		“id”: 1,
		“name”: “User 1”
},
	{
		“id”: 2,
		“name”: “User 2”
},

] 
```

##### Get user information with id 
+ Dynamic end point 
+ Path variable
http://localhost:8080/users/1
```
GET /user/<id>
{
    "id": 1,
    "name": "User 1"
}
```
#### STEP 2 : (branch step_02)
+ Get all user + paging (Query string or parameter)
```
GET /users
page=1
items_per_page=10

GET /users?page=2&items_per_page=15
GET /users?items_per_page=15
```

#### working with requestparam

```
// http://localhost:8080/users?page=2&item_per_page=15

{
  "page": 2,
  "item_per_page": 15,
  "users": [
    {
      "id": 1,
      "name": "User 1"
    },
    {
      "id": 2,
      "name": "User 2"
    },
    {
      "id": 3,
      "name": "User 3"
    }
  ]
}

```
#### STEP 3 : Create a new user (POST) (branch step_03)
```
+ POST /users
{
    "name": "somkiat",
    "age": 30
}
Response
{
    "id": 1234,
    "name": "somkiat",
    "age": 30
}
```
#### STEP 4 : create repo contain database config
+ create Table : User table
+ create Repo : interface UserRepository extends CrudRepository มาช่วยจัดการ Crud
+ insert โดย Controller เรียก repo เพื่อทำการ insert(Spring JPA)

```
+ POST /users
{
    "name": "somkiat",
    "age": 30
}
Response
{
    {
    "id": 2, <-- @GeneratedValue(strategy = GenerationType.AUTO))
    "name": "somkiat30"
     }
}
```
#### Get All user from UserRepository
```
// http://localhost:8080/users

{
  "page": 1,
  "item_per_page": 10,
  "users": [
    {
      "id": 1,
      "name": "somkiat"
    },
    {
      "id": 2,
      "name": "somkiat"
    },
    {
      "id": 3,
      "name": "somkiat"
    },
    {
      "id": 4,
      "name": "somkiat"
    }
  ]
}
```
#### Get user by id from UserRepository
```
// http://localhost:8080/users/3

{
  "id": 3,
  "name": "somkiat"
}
```
