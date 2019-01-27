﻿# 7. 상속
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

<hr>



 ``` kotlin

open class Test

class Test2: Test()
  
 ```

  * class의 **상속**은 파생클래스 Header 옆에 **:**의 키워드로 선언합니다.
  
  * Kotlin에서 클래스는 모두 **final**이라서 **상속될 클래스는 open을 해주어야 합니다**
  
 
 ``` kotlin
 
  open class Test(x:Int)
  
  class Test2:Test(1)
  
  class Test3(c:Int):Test(c)
  
  ```
  
  * 부모 클래스에 기본생성자가 있다면 **: 키워드로 상속 받을 때, 초기화를 해줄 수 있습니다**
  
  * 파생클래스에 **Header안에 매개변수로 부모클래스를 초기화 시킬 수 있습니다** 
  
<hr>

## 파생클래스의 보조 생성자

```kotlin

  open class A{
 
    constructor(a:Int,s:String)
  }
  
  class B:A(){
  
  constructor B():super()
  
  constructor B(x:Int):this()
  
  constructor B(t:Int,s:String):super(t,s)
  }
```
 
  * 파생클라스의 보조생성자들은 **반드시 부모클래스 초기화를 해주어야 합니다** 
  
  * **super**키워드로 직접 초기화 해주거나 **다른 보조생성자를 호출하여 간접으로 초기화합니다**
  
 <hr>
 
## 메소드,프로포티 재정의
  
```kotlin

open class A{

  open fun f(){  print("A")}
  
  fun ff(){ print("AA")}
}

class B:A(){

  override fun f(){ print("B")}
  
  //override fun f(){print("BB")} error

}

```
  * kotlin에서는 재정의될 메소드앞에 **open**키워드가 있어야 재정의가 됩니다.
  
```kotlin
   open class A{
    open val A:Int=1
   }
   
   class B:A(){
    override val A:Int=2
   }
```
  * **kotlin**에서s는 변수도 재정의 할수 있습니다.
  
  * 메소드 재정의와 마찬가지로 **open**키워드가 붙은 프로포티만 **override**로 재정의할 수 있습니다
  
  
 ## abstruct -추상클래스
 
 ```kotiln
 abstract class A{
  abstract fun f()
 }
 
 class B:A(){
  override fun f(){ }
 }
 
 ```
  * **추상 클래스는 open 키워드 없이** override로 재정의 할 수 있습니다.
 
## 중복 상속 사례

 * Java에서 상속이 여러개가 안되는 이유는 같은 이름의 함수가 있을 가능성이 있어서 입니다. **kotlin에서도 마찬가지입니다**
 
 ```kotlin
 
  interface B{
  
   fun f(){   print("B")}
  }
 
 ```
 * 하지만, kotlin의 **Interface**는 함수의 선언만 아니라 내용까지 정의될 수 있습니다. 따라서 아래의 사례에서 문제가 발생할 수 있습니다.
 
 ```kotlin
 
 class A{

 open f(){  print("a")}
}

interface B{
 fun f(){ print("B")}
}
 
class C:A(),B{
  fun f(){  }  // error  -- 1
}
 ```
 
 * error부분에서 문제가 발생한 것을 볼 수있습니다. 상속된 A와 인터페이스 B에서 **같은 이름의 함수 f**가 중복되서 무엇을 override할지 모호성이 생깁니다.
 
 ```kotlin
 
 ...
  
class C:A(),B{
  fun f(){
  super <A>.f() //A클래스 f함수 호출
  } 
}
 ```
 
 * kotlin에서는 이런 문제에 대해서, 직접 접근하여 호출할 수있습니다.
 * super <클래스명>.함수