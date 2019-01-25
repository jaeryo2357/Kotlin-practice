# 6. Classes
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

<hr>



## **class**

 ``` kotlin

class Test() //class body 생략
  
 ```

  * class의 **선언**은 **class**의 키워드로 이용합니다.
  
  * Java와 다르게 **body**선언을 생략할 수 있습니다.
  
 
 ``` kotlin
 
  class Test constructor(name:String)
  
  class Test(name:String) // constructor 키워드 생략
  
  var test=Test("kotlin")
  ```
  
  * class의 **Header**부분은 기본 생성자 부분입니다.
  
  * Header에는 **어노테이션, 접근지정자 , name: 자료형**이 들어갈 수 있으며 **name: 자료형**만 있을 경우 **constructor 키워드를 생략할 수 있습니다.**
  
<hr>

### class의 기본 생성자

 ```java
 
 class Basic{
  Basic(){
      //초기화 과정 
  }
 }
 ```
 
  * Java에서는 Class의 이름과 기본생성자 초기화 블록을 **생성합니다**
  * Java에서 기본생정자는 **매개변수가 없습니다.**
  
  ```kotlin
  class Basic(test:String){
  init{
    //초기화 과정
  }
  ```
  * Kotlin에서는 **init**키워드로 선언한 블록에서 **초기화 블록을 생성합니다**
  * Kotlin에서 기본생성자는 **매개변수가 존재 할수있습니다**
 <hr>
 
## class의 보조생성자
  
 ```java
   
   class Basic(){
   
     Basic(){
        // 기본 생정자
     }
     
     Basic(name:String){
       // 보조 생성자
     }
     ...
   }
   
 ```
  * **Java**에서 보조생성자는 class의 이름으로 선언합니다.
  * **보조 생성자 갯수에 제한이 없습니다**
  
```kotlin
   class Basic(){
   
   init{
      //기본생성자 초기화
   }
   
   constructor(name:String):this(){
     // 직접 지정 보조 생성자
   }
   
   constructor(name:String,Basic()):this("간접"){
     // 간접 지정 보조 생성자
   }
   
   }
```
  * **kotlin**에서 보조생정자는 **constructor**키워드로 선언합니다.
  
  * Java와 다르게 보조생성자는 **기본 생성자를 맵핑해야합니다 ex):this()**
  
 
