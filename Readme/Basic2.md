2.기본 자료형
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
   </pre>
   
  
   * Kotlin에서는 명시적인 변환이 존재하지 않는다.
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
     
      var a:Int=10
      var b:Int=10
     
      print(a==b)  // true
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
     </pre>
     
    
   
  
