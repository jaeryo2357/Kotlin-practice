# 입력

* **Kotlin**은 자바와 연동이 되기 때문에 Scanner를 사용할 수 있습니다.

```kotlin

var scanner = Scanner(System.in)

var a= scanner.nextInt() // Int형 정수형
```

* kotlin의 `readLine()` 함수를 사용하여 입력을 받아들 일 수 있습니다.
* readLine()으로 읽어들인 값을 `Double`형으로 받아 들일 때, 입력한 값이 `29a`형식이 다를 수 있기에 `!!`키워드를 붙여준다. but Error 발생할 수 있다.

``kotlin
var a = readLine()!!.toDouble()
```
