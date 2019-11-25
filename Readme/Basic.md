2.기본문법
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.
* **Package 규칙**
  * Package 선언은 **소스파일 맨 위에** 선언 해야 함

  <hr>
  
  ```kotlin
  package hello

  fun main(args : Array<String>){ ... }
  ```

  * Kotlin에서 Package와 실제 소스코드가 위치한 Directory가 일치할 필요가 없다.


* **세미 클론**
  
  * kotlin은 java와 달리 문장의 종료에서 **세미클론을 쓰지 않습니다.**
  
  ```kotlin
    var a:Int = 2
  
  ```


* **함수 선언**

  * kotlin은 **fun**키워드를 사용하여 함수를 선언하며 반환타입은 맨 뒤에 옵니다.

  * 매개변수는 **name: type**으로 정의되며 **매개변수들은 ,로 구분됩니다.**
  * **Java**

  ``` java
  int sum(int a,int b){
  return a+b;
  }
  ```

  * **Kotlin**

  ``` kotlin
  fun sum(a: Int,b: Int):Int{
  return a+b
  }
  ```

  * 반환값이 없으면 Java-> void , Kotlin -> **Unit**
   * **Java**
   <hr>
    
    ```java
      void PrintValue(){
      System.out.print("hello");
      }
    ```

   * **Kotlin**
   <hr>
   
    ```kotlin
     fun PrintValue():Unit{
      print("hello")
      }
    ```
    > Unit은 생략할 수 있습니다.
    
     ```kotlin
     fun PrintValue(){
      print("hello")
      }
    ```
 * **변수 선언**
    * **val**

      * val java에서 **final**가 유사합니다. (상수)

      * **Kotlin**

      ```kotlin
      val a:Int=2
      val b=2  // 대입 값으로 int형을 유추
      val c:Int 
      c=3 // 한번만 초기화 가능
      ```
        * **Java**

        ```java
        final int a=2;
        final int a; //complie error 무조건 초기화 해야함
        ```
    * **var**
      * var은 자바의 일반변수와 같습니다.
      ```kotlin
      var x=2
      ```
  * **주석**
    * Kotlin
      * Kotlin에서의 주석은 Java와 유사합니다. 
      ```kotlin
       //            한 줄 주석

       /*   */       블럭 주소
       
       /*
        /*
                      중첩으로 주석 넣을 수 있다.        
        */
        */
      ```
      
   * **문자열**
     * Java
     ```java
      int a=2;
      String s=" string test "+a+" is good";
     ```

     * Kotlin
     ```kotlin
     var a=2
     val s=" string test $a is good"  //$ 표시로 value 대입가능

     var s2="string ${s.replace("is","was")},but now is &a" // 함수호출 부분도 {}사이에 대입가능
     ```

   * **함수의 생략**
     * 함수의 내용이 한 문장으로 끝나는 경우, 생략을 할수 있다.

     ```kotlin
     fun sum(a:Int,b: Int):Int{
       return a+b
       }
     ```

     ```kotlin
     fun sum(a:Int,b: Int)=a+b
     ```
