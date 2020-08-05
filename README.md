# workshop06-RESTful-api
#### init project :
```
>> gradlew
 รอจน build successful
>> gradlew test 
มันจะโหลด libraries เยอะ(ครั้งเดียว) รอจน build successful
>> gradlew bootRun
การ start web server ของ spring boot 
จะ error ที่ถูกต้องสำหรับการรันครั้งแรก

```


##### Notice : Build fail : check your java 
```
>> javac -version
>> set JAVA_HOME=<PATH java>
```

#### Let's start
reference doc : https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/html/

##### รัน production (.Jar) 
```
>> gradlew bootJar 
>> gradlew clean bootJar 
```

##### รัน (.Jar) 
```
เข้า folder \libs
>> java -jar //path
>> java -jar build\libs\demo-0.0.1-SNAPSHOT.jar

```
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
