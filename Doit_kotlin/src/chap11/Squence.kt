package chap11



//Sequence는 무한한 값을 출력하고 그 값들 중 특정 범위값을 가져올 수 있다.
val fibonacciSeq = sequence {
    var a = 0
    var b = 1

    //지연함수이면서 값을 반환하는 함수
    yield(1)

    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    println(fibonacciSeq.take(8).toList())

    //iterator를 사용하여 직접 제어도 가능
    val save = fibonacciSeq.iterator()
    println("${save.next()} + ${save.next()}")
}