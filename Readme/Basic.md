2.기본문법
-------------

* [HOME](./README.md)

<<<<<<< HEAD
> �� �Խñ��� Java��  Kotlin�� ���ϸ� �����մϴ�.
=======
> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.
>>>>>>> f90ef18f44ee3e3f875dedb49984c595c93aac76

* **Package 규칙**
  * Package 선언은 **소스파일 맨 위에** 선언 해야 함
  
  <hr>
  <pre>
  package hello
  
  fun main(args : Array<String>){ ... }
  </pre>
      
  * **Kotlin에서 Package와 실제 소스코드가 위치한 Directory가 일치할 필요가 없다.**
 
* **함수 선언**

  * kotlin은 **fun**키워드를 사용하여 함수를 선언하며 반환타입은 맨 뒤에 옵니다.
  
  * 매개변수는 **name: type**으로 정의되며 **매개변수들은 ,로 구분됩니다.**
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
 * **변수 선언**
    * **val**
   
      * val java에서 **final**가 유사합니다. (상수)
   
      * **Kotlin**
  
      <pre>
      val a:int=2
      val b=2  // 대입 값으로 int형을 유추
      val c:int
      c=3 //한번만 초기화 가능
      </pre>
        * **Java**
   
        <pre>
        final int a=2;
        final int a; //complie error 무조건 초기화 해야함
        </pre>
    * **var**
      * var은 자바의 일반변수와 같습니다.
      <pre>
      var x=2
      </pre>
  * **주석**
    * Kotlin
      * Kotlin에서의 주석은 Java와 유사합니다. 
      <pre>
       //            한 줄 주석
       
       /*   */       블럭 주소
       
       /*
        /*
                      중첩으로 주석 넣을 수 있다.        
        */
        */
      </pre>
      
   * **문자열**
     * Java
     <pre>
      int a=2;
      String s=" string test "+a+" is good";
     </pre>
      
     * Kotlin
     <pre>
     var a=2
     val s=" string test $a is good"  //$ 표시로 value 대입가능
     
     var s2="string ${s.replace("is","was")},but now is &a" // 함수호출 부분도 {}사이에 대입가능
     </pre>
     
   * **함수의 생략**
     * 함수의 내용이 한 문장으로 끝나는 경우, 생략을 할수 있다.
     
     <pre>
     fun sum(a:Int,b: Int):Int{
       return a+b
       }
     </pre>
     
     <pre>
     fun sum(a:Int,b: Int)=a+b
     </pre>
