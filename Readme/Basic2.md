3.기본 자료형
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

*  **기본 자료형**

 * Java와 비슷한 자료형을 가지지만 Kotlin에서는 모두 객체 취급입니다.
 
|  <center>자료형</center> |  <center>바이트</center> |
|:--------|:--------:|
|**Double** | <center>8 </center> |
|**Float** | <center>4 </center> |
|**Long** | <center>8 </center> |
|**Int** | <center>4 </center> |
|**Short** | <center>2</center> |
|**Byte** | <center>1 </center> |

 * **Java와 차이점**
 
   * 문자를 나타내는 **Char**형은 숫자로 정의되어 있지 **않습니다**.
   ```kotlin
   var a:Char='a'
   if(a==1)  //error
   
   if(a=='a')
   
   print(a.toInt()) //출력 65 숫자로 변환 시킬 수 있습니다.
   ```
   
  
   * Kotlin에서는 명시적인 변환으로 형에 맞게 대입해주어야 합니다.
    ```java
    //java
    double number =60;
    ```
    ```kotlin
    //kotlin
    var number : Double =60  // error
    
    var number : Double = 60.0
    ```
   
    이 처럼, Java에서는 자료형에 알맞는 값을 찾아 **자동으로 형 변환**이 이루어 지지만
    Kotlin에서는 **error를 발생**합니다.
    
      * 위 문제를 해결하기 위해서 자료형마다 형변환을 해주는 함수가 존재합니다.
     
     ```kotlin
      var a:Int=1
      var b:Byte= a.toByte()
      var c:Double = a.toDouble()
     ```
     * 스마트 캐스터 자료형을 사용할 수도 있습니다.
     ```kotlin
     var a:Number = 1
     a = 23.0
     a = 1.0f
    ```
    
  * **Operation**
  
    * kotlin에서는 Java에서와는 달리 equlity의 비교가 **==로** 정의 됩니다.
    
     ```kotlin
     
      var a:Int=10
      var b:Int=10
     
      print(a==b)  // true
      
      print(a===b) // true
     ```
    * kotlin에서 === 연산자는 **참조 주소가 같은 지 비교하는 연산자**입니다. kotlin 변수는 모두 참조형 변수지만 최적화를 위해서 컴파일     과정에서 **java에 기본 자료형으로 변환되게 됩니다.**  위의 코드를 컴파일하면서 java 코드도 변하게 되면
    
    ```java
    
    int a = 10;
    int b = a;
    ```
    
    기본 자료형으로 변하고 같은 값은 이전 값을 참조하면서 참조 주소가 다른 경우가 없습니다. 그렇다면 참조값이 달라지는 경우는 언제일까요
    바로 **Nullable** 변수를 사용할 때입니다.
    
    ```kotlin
    var a : Int? = 2
    var b : Int? = 2
    ```
    
    ```java
    Integer a = 2;
    Integer b = 2;
    ```
    
    Nullable 변수를 컴파일 과정에서 변경할 때, 기본자료형은 null을 포함할 수 없기에 객체 자료형으로 표현됩니다. 따라서 이 경우 **참조 주소가     달라지게 됩니다.**
    
    * **비교 연산자**는 Java와 동일합니다
    
     ```kotlin
      a > b
      a>=b
      a < b
      a <= b
     ```
    * **범위 연산자**가 추가 되었습니다
    
     ```kotlin
      a..b  a와 b 사이
      
     //in 키워드로 범위를 확인합니다.
     
     if( 1 in a..b)
     
     ```
     
  * **Array 배열**
    
     * Java에서 달리 **Kotlin**에서는 **Array**키워드로 배열을 정의합니다.
     
      ```kotlin
      var str:Array<String>
      ```
      
     * **배열의 생성**
      
       * arrayOf
       
        ```kotlin
         
         var str=arrayOf(1,2,3,4)
         var str1:Array<String>=arrayOf("1","2")
         
       ```
       * Array (팩토리얼)
       
        ```kotlin
        
        var str= Array(5, {i -> i.toString()})
        
        같은 배열입니다.
        
        var str= arrayOf("0","1","2","3","4") 
        ```
     
   * **String**
   
     * Java와 비슷합니다.
     
      * immutable 속성으로 **객체 내부 내용 수정**이 불가능
      
      * **char형으로 구성**되어 있어 [] 키워드로 접근 가능합니다.
      
      ```kotlin
      
       var str="char"
       
       print(str[0])   // "c" 출력
      ```
      
   * String **리터럴**
     
     * "" "" - 일반적인 문자열 리터럴
     
      * 개행문자와 비슷한 기능들을 **/** 로 사용해야함 (ex /n , /" ,/t)
     
      ```kotlin
        var str="char"
        
        var str="Enter /n"
        
      ```
      
     * """ """ - 추가된 문자열 리터럴
    
      ```kotlin
      
       var str= """  
       
        Enter 개행문자없이 개행가능
        """
      
      ```
    
   
  
