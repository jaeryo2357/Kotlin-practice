package chap03.section2


//고차함수는 인자나 반환값으로 함수를 사용하고 함수는 이름 없는 함수(람다식)이나 이름 있는 함수가 사용됩니다.
fun main() {
    val res1 = sum(3,2)
    val res2 = mul(sum(3,3),3)

    println("res1 : $res1, res2: $res2")
    println("funcFunc: ${funcFunc()}")
}

fun sum(a:Int,b:Int) = a+b

fun mul(a:Int,b:Int) = a*b

fun funcFunc():Int
{
    return sum(2,2)
}