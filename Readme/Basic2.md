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
   <pre>
   var a:Char='a'
   if(a==1)  //error
   
   if(a=='a')
   
   print(a.toInt())  숫자로 변환 시킬 수 있습니다.
   </pre>
   
  
   * Kotlin에서는 명시적인 변환으로 형에 맞게 대입해주어야 합니다.
    <pre>
   
    **java**
    double number =60;
   
    **kotlin**
    var number : Double =60  // error
    </pre>
   
    이 처럼, Java에서는 자료형에 알맞는 값을 찾아 **자동으로 형 변환**이 이루어 지지만
    Kotlin에서는 **error를 발생**합니다.
      * 위 문제를 해결하기 위해서 자료형마다 형변환을 해주는 함수가 존재합니다.
     
     <pre>
      var a:Int=1
      var b:Byte= a.toByte()
     </pre>
  * **Operation**
    * Java에서와 반대로 equlity의 비교는 **==** 입니다.
    
     <pre>
     
      var a:Int?=10
      var b:Int?=10
     
      print(a==b)  // true
      
      print(a===b) // false
     </pre>
    * **비교 연산자**는 Java와 동일합니다
    
     <pre>
      a > b
      a>=b
      a < b
      a <= b
     </pre>
    * **범위 연산자**가 추가 되었습니다
    
     <pre>
      a..b  a와 b 사이
      
     //in 키워드로 범위를 확인합니다.
     
     if( 1 in a..b)
     
     </pre>
     
  * **Array 배열**
    
     * Java에서 달리 **Kotlin**에서는 **Array**키워드로 배열을 정의합니다.
     
      <pre>
      var str:Array&#60String&#62
      </pre>
      
     * **배열의 생성**
      
       * arrayOf
       
        <pre>
         
         var str=arrayOf(1,2,3,4)
         var str1:Array&#60String&#62=arrayOf("1","2")
         
        </pre>
       * Array (팩토리얼)
       
        <pre>
        
        var str= Array(5, {i -> i.toString()})
        
        같은 배열입니다.
        
        var str= arrayOf("0","1","2","3","4") 
        </pre>
     
   * **String**
   
     * Java와 비슷합니다.
     
      * immutable 속성으로 **객체 내부 내용 수정**이 불가능
      
      * **char형으로 구성**되어 있어 [] 키워드로 접근 가능합니다.
      
      <pre>
      
       var str="char"
       
       print(str[0])   // "c" 출력
      </pre>
      
   * String **리터럴**
     
     * "" "" - 일반적인 문자열 리터럴
     
      * 개행문자와 비슷한 기능들을 **/** 로 사용해야함 (ex /n , /" ,/t)
     
      <pre>
        var str="char"
        
        var str="Enter /n"
        
      </pre>
      
     * """ """ - 추가된 문자열 리터럴
    
      <pre>
      
       var str= """  
       
        Enter 개행문자없이 개행가능
        """
      
      </pre>
    
   
  
