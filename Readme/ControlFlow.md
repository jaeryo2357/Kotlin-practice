# 4.흐름 제어
-------------

* [HOME](./README.md)

> 본 게시글은 Java와 Kotlin을 비교하며 설명합니다.

<hr>

* 정리
  * **Kotlin**의 if else, when 등은 값을 반환할 수 있다.
  
<hr>


## **if else문**

 ``` kotlin

 if( 1>2)
  print("1 is up")
 else
  print("2 is up")
  
 ```

  * Java에서 사용하는 if else과 비슷합니다.
  * if( 조건문){ }
 
 ``` kotlin
 
 var max= if(a>b) a else b
 
 var max2= if(a>b)a else if (a<c) c else b
 
 ```
  * kotlin에서는 if else가 **값을 반환합니다. but 무조건 else문이 포함되어 있어야합니다**
  
 ``` kotlin
 
 var max= if(a>b){
  print("Choose a")
  a
 }else{
  print("Choose b")
  b
 }
 ```
   * 값을 반환 할때 , 블럭으로 감싸져 있는 경우 제일 **마지막에 위치한 것이 반환값이 됩니다.**
   
<hr>

## 인자를 가진 When

 ``` kotlin

 when(x){

 20 -> print(x)

 30 -> print(x+2)
 
 10,0 -> print(x+3) //10 or 0

  in 1..10 -> { }         // in 범위 연산자로 
  in 1.. 20 -> {
      print("x")
      Dedkad(1)             // 블럭을 사용하여 여러 문장의 실행문도 가능
   }
   
  is String -> {           // 객체가 String인지 비교
      print("x is String") 
  }
   
  parseInt("20") -> { }    // 함수호출문도 조건문에 들어갈 수 있음

 else -> print(1)
 }
 ```
 
  * Java에서 **Switch와 매우 비슷합니다.**
  
  * 순차적으로 실행되면서 **적당한 한개의 실행문만 실행됨. 따라서 break문이 필요없습니다**
  
  * **-> 기호 사이로 조건문과 실행문이 나누어져 있습니다.**
 
 * **When 함수도 값을 반환할 수 있습니다. 단 else를 포함하는 것을 권장합니다**
 
 ```kotlin
 
 var max= when(x){
 
 "10" -> 2
 
 else -> 4
 }
 
 
 var max2 = when(x){  // 위와 같이 else가 필요없는 경우는 생략가능
 
   true -> 2
   false -> 4
 }
 ```
 <hr>
 
 
## 인자가 없는 When

 * 인자가 없는 when은 java의 else if 문의 복잡성을 줄여주는 데 좋습니다.
 
 ```kotlin
 
  when {
    x in 1..10  -> {     }
    x in 2.. 5 -> {   }
  }
 ```
* 위에서 부터 차례대로 조건을 검사하여 **true**일때 해당 본문을 실행한다.




## for 반복문
  
  * **세미클론**이 없는 kotlin에서는 for문은 다른 구조로 쓰입니다.
  
 ```kotlin
 for(value in collection,range)
    print("$value")
 
 ```
  
  * 보통은 자동 증가연산으로 for문이 구현됩니다.
  
  ```kotlin
  for(value in 1..5)
  {
    print(value)        // 출력 12345
  }
 
  ```
  * **감소해서 반복하기**
  
  ```kotlin
  for(value in 5 downTo 1)
  {
     print(value)   // 출력 54321
  }
  ```
  * **2씩 증가/감소 하기**
  
  ```kotlin
  for(value in 1..5 step 2)
  {
     print(value)   //출력 135
  } 
  
  ```
 
  * **Iterator를 반환하는 객체면 무엇이든지 반복 할수 있습니다**
  

  * 배열인 경우, **for문에서 index 참조가 필요한 경우가 있습니다**
  
 ``` kotlin
  
  for( index in array.indices)  // index가 순차적으로 들어옴
     print("$index")
  
 ```
 
  * **인덱스와 값 둘다 필요한 경우**
  
 ``` kotlin
 
  for((index,value) in array.withIndex())
    print("$index:$value")
 ```
<hr>

## while 반복문
* for문 처럼 자동으로 종료해주는 연산없이 개발자가 직접 만들어 주어야 한다.

```kotlin
  while(i<3)
  {
     i++
  }

```
## Do While 반복문

* java와 다른 점은 **조건문에서 Do while 내부의 변수에 접근 가능**


``` kotlin

do{
  var y=10
  y++
  }while(y<20)

```
## Return

* 값을 반환하여 함수를 종료하는 기능을 가진 키워드 입니다.
* return 키워드가 생략된 것도 `Unit`을 반환하는 것으로 처리됩니다.

```kotlin
fun sum(a:Int,b:Int):Int{return a+b}
```


