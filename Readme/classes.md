# 6. Classes
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

<hr>



## **class**

 ``` kotlin
class Test{ }
class Test//class body 생략
  
 ```

  * class의 **선언**은 **class**의 키워드로 이용합니다.
  
  * Java와 다르게 **body**선언을 생략할 수 있습니다.
  
 ### class 구조
 
   | kotlin | java |
   ------|------
  | 클래스 이름 | 클래스 이름 |
  | property | 멤버 변수 |
  | Method | 멤버 함수 |
 
 ```kotlin
 
 class Test{
 //property
 
 var exam = "easy"
 
 val result = "A+"
 
 //Method
 
 fun Func():Unit {  }

 }
 ```
 
 ### 생성자
 
 * 생성자는 객체가 생성이 될 때, 호출이 되는 함수 입니다. 주 생성자와 보조 생성자 **2가지**로 존재합니다.
 * 생성자는 **property의 초기 값을 설정**하기 위해 주로 사용합니다.
 
 * **보조 생성자** - constructor 키워드로 class 내에 선언합니다.
 
 ``` kotlin
 
  class Test{
  
    var name : String = "test"
    constructor(name:String){
       this.name = name
    }
  
  }
  var test= Test("kotlin")
  ```
  
  * 생성자의 매개변수 이름과 property의 이름이 동일하기 때문에 **this**으로 접근해서 초기화한 모습입니다.
  
  ```kotlin
   
   constructor(_name:String){
     name = _name
   }
  ```
  
  * 매개변수 이름에 _을 사용하여 this를 사용하지 않고 초기화 할 수 도 있습니다.
  
  * **dafault 값을 지정한 보조 생성자**도 만들 수 있습니다.
  
  ```kotlin
  
  class Test{
  
    var name: String = "test"
    var grade: String = "A+"
  
    constructor(name:String,grade:String = "B+"){
      this.name = name
      this.grade = grade
    }
  }
  
  ...
  var test_1  = Test("a","A")
  var test_2 = Test("b") 
  ```
  
  * **주 생성자** - class 키워드 이름 옆에 선언이 됩니다.
  
  ```kotlin
  class Test constructor(_name:String,_grade:String)
  {
    var name :String = _name  //"a"
    var grade:String = _grade  //"A"
  }
  
  ...
  
  var test = Test("a","A")
  ```
  * 주 생성자도 **default** 값을 지정할 수 있습니다.
  
  ```kotlin
  class Test constructor(_name:String="n",_grade:String="C"){ }
  ```
  
  
  * 위와 같이 주 생성자가 **name: 자료형**만으로 명시되어 있을 경우 **constructor 키워드를 생략할 수 있습니다.**
  
  ```kotlin
  class Test (_name:String="n",_grade:String="C")
  ```
  
  * 주 생성자에서 **var키워드를 사용해 property를 생성**할 수도 있습니다. 아래 2개의 코드는 동일한 결과입니다.
  
  ```kotlin
  class Test(var name:string , var grade:String)
  ```
  
  ```kotlin
  class Test(_name:string,_grade:String)
  {
    var name:String = _name
    var grade:String = _grade 
  }
  ```
  
<hr>

 * **기본 생성자** - **init 키워드**로 생성되며 class 당 1개만 존재합니다.
 * 기본 생성자는 porperty값을 초기화하는 다른 생성자들과 다르게 **코드를 실행하고 싶을 때 사용**됩니다.

  ```kotlin
  class Test(var name:String){
  init{
      print("Test 객체 생성")
   }
  }
  ```
  
 

