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
