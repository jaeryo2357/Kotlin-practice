2.기본문법
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

* **Package 규칙**
  * Package 선언은 **소스파일 맨 위에** 선언 해야 함
  
  <hr>
  <pre>
  package hello
  
  fun main(args : Array<String>){ ... }
  </pre>
      
  * **Kotlin에서 Package와 실제 소스코드가 위치한 Directory가 일치할 필요가 없다.**
 
* **함수 선언**

  * **Java**
 
  <pre>
  int sum(int a,int b){
  return a+b;
  }
  </pre>
  
  * **Kotlin**

  <pre>
  fun sum(a: Int,b: Int):Int{
  return a+b
  }
  </pre>

  * kotlin은 **fun**키워드를 사용하여 함수를 선언하며 반환타입은 맨 뒤에 옵니다.
  
  * 매개변수는 **name: type**으로 정의되며 **매개변수들은 ,로 구분됩니다.**
  
  * 반환값이 없으면 Java-> void , Kotlin -> **Unit**
   * **Java**
   <hr>
    <pre>
      void PrintValue(){
      System.out.print("hello");
      }
    </pre>
    
   * **Kotlin**
   <hr>
    <pre>
     fun PrintValue():Unit{
      print("hello")
      }
    </pre>
    > Unit은 생략할 수 있습니다.
    
     <pre>
     fun PrintValue(){
      print("hello")
      }
    </pre>
  *