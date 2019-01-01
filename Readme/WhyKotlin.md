1.Why Kotlin
-------------

* **Kotlin**은 2017년 5월 구글에서 공식으로 인정된 안드로이드 언어입니다. Java와 같은 **정적 프로그래밍 언어**로 JVM, Android, Browser, Native 앱에 사용될 수 있습니다.

* **장점**

  * **간결성**
    * Kotlin의 가장 큰 장점중 하나로 코드의 양을 대폭 줄입니다.
      * JAVA
        <pre>
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
        
        </pre>
        
      * Kotlin
        <pre>
        data class Customer(val name: String, val email: String, val company: String)
        </pre>
  * **안정성**
  
    * Exception의 발생을 **최소화**
    
      * Kotlin의 **NullPointException 최소화**
        <pre>
        var output: String
        output=null // 컴파일 에러 --> null 값을 넣을 수 없게 컴파일 에러를 발생시킴
        </pre>
        <pre>
         val name: String? =null // Nullable Type
         println(name.lenght())  // 컴파일 에러 발생--> null 값이면 접근을 막음
        </pre>
        
        
        
     * 자동으로 **Casting**
     
     
        * **Java**
          <pre>
           public void Func(Object obj)
           {
              if(obj instanceof Invoice)
                ((Invoice)obj).calcualteTotal();
           }
          </pre>
     
     
        * **Kotlin**
          <pre>
          fun Func(obj : Any) // Any는 java에서 Object와 같은 최상위 클래스
          {
            if(obj is Invoice)
              obj.calculateTotal()
          }
          </pre>
          
          **Kotlin**은 if(obj is Invoice)에서 obj가 **자동으로 Invoice로 Casting 됨**
         
        






