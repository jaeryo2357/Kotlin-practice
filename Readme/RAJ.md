# 5. Package,Return and Jumps
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

<hr>



## **Package**

 ``` kotlin

package kotlin.collection.*
  
 ```

  * package 선언은 **소스코드 제일 위에** 선언 되어야 합니다.
  
  * Java와 다르게 **Package 선언을 꼭 해줄 필요 없으며**, 선언하지 않을 경우 defalut package에 소속됩니다.
  
 
 ``` kotlin
 
 package kotlin.collection.*
 
 package kotlin.collection.arrayOf
 
 package kotlin.collection.ArrayList
 
 
 package test1.bar
 package test2.bar as ebar  //test1에서의 bar와 충돌로 ebar로 재정의
 
 ```
  * kotlin에서의 package는 **함수, 객체 등을 포함**합니다.
  
  * Java와 다르게 **as 키워드로 이름을 재정의**해줄 수 있습니다.
   
<hr>

## Return, break , continue

 ``` kotlin

  fun sum(a:Int, b:Int):Int{
    return a+b                      // return은 함수나 익명함수에서 값을 반환하거나 종료할 때
  }
  
  for(i in 1..10){
    if(i>3)break                    // break는 함수나 루프에서 종료하고 싶을 때
    print("$i")
  }
  
  for(i in 1..10){
    if(i<3)continue                 //continue는 루프에서 다음 반복으로 넘어갈 때
    print("$i")
  }
 }
 ```
 
  * 기본 사용법은 Java와 **같습니다**
 
 <hr>
 
## label
  
 ```kotlin
   loop@
 ```
  * **kotlin**에서 **label**과 **break,continue,return**을 쓸수 있습니다.
  * **사용자 지정 + @** 또는 **암시적 label도 가능합니다.**
  
```kotlin
   for(i in 1..10)
     {
       for(j in 1..10)
       {
           if(j>3)break
           println("$i x $j = ${i*j}")
       }
     }
```
 > 결과
 <pre>
 1 x 1 = 1
 1 x 2 = 2
 1 x 3 = 3
 2 x 1 = 2
 2 x 2 = 4
 .
 .
 .
 10 x 3 = 30
 </pre>


  * 위 처럼, **for문의 중첩**에서 break를 사용하면 **그 break를 감싸고 있는 for문만 종료**됩니다.
  
  * 하지만, **label**을 사용하면 2개의 for문 모두 종료할 수 있습니다.
  
  
  
  
 ``` kotlin
  
  @loopfor(i in 1..10)
     {
     
       for(j in 1..10)
       {
           if(j>3)break@loop
           println("$i x $j = ${i*j}")
       }
     }
  
 ```
>결과 
 <pre>
 
 1 x 1 = 1
 1 x 2 = 2 
 1 x 3 = 3
 
 </pre>
 
 * @loop를 제일 상위에 존재하는 **for문 키워드 앞에** 놓아주면 **label이 인식**되며, **break 시 해당 라벨을 붙여주면 알맞게 종료가 됩니다**
 
 <hr>
 
### 람다와 label
  
 ``` kotlin
   
   fun test(){
     
     var list=arrayOf(0,1,2,3)
    
     list.forEach(fun(value:Int){
        if(value==1)return
        print("$value")
     })
    
     println("End")
   }
 ```
> 결과
<pre>
023
</pre>

* kotlin에서의 **함수 중첩 중**, return를 사용한 경우 

``` kotlin
   
   fun test(){
     
     var list=arrayOf(0,1,2,3)
    
     list.forEach({
      if(it==1)return
      print("$it")
     })
    
     println("End")
   }
 ```
> 결과
<pre>
0
</pre>

* 하지만 람다식을 사용할 경우, 결과가 덜 나오게 됩니다. 그 이유는 람다의 **return**이 **test 함수를 종료하기 때문입니다.""
  그래서 **label을 이용해서 원하는 결과를 도출해야 합니다**
  
``` kotlin
   
   fun test(){
     
     var list=arrayOf(0,1,2,3)
    
     list.forEach(loop@{
      if(it==1)return@loop
      
      //if(it==1)return@forEach  // loop@지우고 암시적 label
      print("$it")
     })
    
     println("End")
   }
 ```
> 결과
<pre>
023
</pre>  

<hr>

### label과 값 반환

* return문은 단순히 함수 종료가 아닌, **값반환으로 쓰일 경우가 많습니다.**

```kotlin
return 1
```

* return label 값

```kotlin
fun test2{
 var list=arrayOf(1,2,3,4)

 var max=list.map({
  if(it==1) return@map "one"
  "number$it"
 })
}
```
