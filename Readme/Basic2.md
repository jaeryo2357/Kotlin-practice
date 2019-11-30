3.기본 자료형
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

*  **val var**
   * kotlin에서 변수는 immutable `val`키워드와 mutable `var`키워드로 변수를 선언합니다.
   * val 변수들은 값이 변경이 불가능한 변수들로 선언과 동시에 초기화를 해야합니다.
   * var 변수들은 값이 변경이 가능한 변수들입니다.
   
   ```kotlin
   val a : Int  = 3
   var b : Int = a
   b = 5
   var c : Int
   c = 6
   ```
 
* **자료형 추론**
   * 변수를 선언할 때 초기화를 하는 경우(값이 추론이 가능할 때) 자료형을 **생략**할 수 있습니다.  
   ```kotlin
     var a : Int = 3
     var b : 3   // Int 자료형 생략
   ```
 * **음수를 포함한 정수형**
 
|  <center>자료형</center> |  <center>바이트</center> | <center>값의 범위 </center> |
|:--------|:--------:|:--------:|
|**Long** | <center>8 </center> |<center> -2^63 ~ 2^63 -1 </center>|
|**Int** | <center>4 </center> |<center> -2^31 ~ 2^31 -1 </center>|
|**Short** | <center>2</center> |<center> -2^15 ~ 2^15 -1 </center>|
|**Byte** | <center>1 </center> |<center> -2^7 ~ 2^7 -1 </center>|

 ```kotlin
 val a: Long = 15L
 val b: Int = 15
 val b2 = 0xFD  // Int형으로 추론
 val b3 = 0b1111 //Int형으로 추론
 
 //Short와 Btye는 직접 명시해 주어야 한다.
 val c: Short = 15
 val d: Byte = 15
 ```
* **음수를 포함하지 않은 정수형**

|  <center>자료형</center> |  <center>바이트</center> | <center>값의 범위 </center> |
|:--------|:--------:|:--------:|
|**ULong** | <center>8 </center> |<center> 0 ~ 2^64 -1 </center>|
|**UInt** | <center>4 </center> |<center> 0 ~ 2^32 -1 </center>|
|**UShort** | <center>2</center> |<center> 0 ~ 2^16 -1 </center>|
|**UByte** | <center>1 </center> |<center> 0 ~ 2^8 -1 </center>|

```kotlin
 val a : ULong = 15uL
 val b : UInt = 15u
 
 val c = 15u // error 발생 음수를 포함하지 않는 정수형은 반드시 자료형을 명시해주어야한다.
```

* **문자 자료형**


|  <center>자료형</center> |  <center>바이트</center> | 
|:--------|:--------:|
|**Char** | <center>2 </center>|

   ```kotlin
   var a:Char='a'
   if(a==1)  //error
   
   if(a=='a')
   
   print(a.toInt()) //출력 65   숫자로 변환 시킬 수 있습니다.
   print(a+1) //출력 b
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
    
   
  
