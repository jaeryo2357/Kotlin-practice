1.Why Kotlin
-------------

* **Kotlin**은 2017년 5월 구글에서 공식으로 인정된 안드로이드 언어입니다. Java와 달리 **함수형 프로그래밍이 가능**하며 JVM, Android, Browser, Native 앱에 사용될 수 있습니다.

* **장점**

  * **간결성**
    * Kotlin의 가장 큰 장점중 하나로 **코드의 양을 대폭 줄입니다.**
      * **java**
        ```java
        class data{
        String name;
        String email;
        String company;
        
        String GetName(){
           return name;
        }
        void SetName(String name)
        {
          this.name=name;
        }
        
        ... 등등 모든 변수에 해당하는 Getter,Setter,equals(),hashCode(),toString(),copy() 를 정의해야함
        
        ```
        
      * **Kotlin**
        ```kotlin
        data class Customer(var name: String, var email: String, var company: String)
        ```
        
     * 자료형 추론으로 변수 선언이 간편하다.
      
       * **java**
       
        ```java
        CameraDevice.OnStateCallbackListener callback = new CameraDevice.OnStateCallbackListener{ ... }
        ```
       * **kotlin**
     
        ```kotlin
        val callback = new CameraDevice.OnStateCallbackListener{ ... }
        ```
  * **안정성**
  
    * Exception의 발생을 **최소화**
    
      * Kotlin의 **NullPointException 최소화**
        ```kotlin
        var output: String
        output=null // 컴파일 에러 --> null 값을 넣을 수 없게 컴파일 에러를 발생시킴
        ```
        
        ```kotlin
         val name: String? =null // Nullable Type
         println(name.lenght())  // 컴파일 에러 발생--> null 값이면 접근을 막음
        ```
        
      * Nullable Type일 경우 개발자가 직접 코드에서 null일 경우를 명시해주어야 함
      
        ```kotlin
        val name: String? = null
        println(name?.length())  // ?. 기법으로 name이 null이 아니면 length() 결과값을 name이 null이면 null을 반환합니다.
        ```
        
        
        ```kotlin
        val name: String? = null
        println(name!!.length()) // !!기법으로 name이 null일수가 없다라고 개발자가 명시해놓은 상황으로 실제 구동시 name이 null이면 NPE이 발생한다.
        ```
        
        
     * 자동으로 **Casting**
     
     
        * **Java**
          ```java
           public void Func(Object obj)
           {
              if(obj instanceof Invoice)
                ((Invoice)obj).calcualteTotal();
           }
          ```
     
     
        * **Kotlin**
          ```kotlin
          fun Func(obj : Any) // Any는 java에서 Object와 같은 최상위 클래스
          {
            if(obj is Invoice)
              obj.calculateTotal()
          }
          ```
          
          ```kotlin
          fun Func(obj : Any)
          {
            val temp : Invoice = obj as Invoice
          }
          
          ```
          
        * if(obj is Invoice)에서 is문법으로 실제 obj가 Invoice일 경우 **자동으로 Invoice로 Casting 됨**
        
        * as 문법은 강제 형 변환으로 만약 obj가 Invoice가 아닐 경우 **Type casting Error를 발생**한다.
         
        






