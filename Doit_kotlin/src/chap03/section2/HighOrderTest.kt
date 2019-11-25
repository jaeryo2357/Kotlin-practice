package chap03.section2

fun main() {
    var result: Int
    val multi = {x:Int,y:Int -> x*y}
    result = multi(10,20)

    println(result)

    result = highOrder({x,y->x+y},10,20)
    println(result)
}

fun highOrder(sum: (Int,Int)->Int,a:Int,b:Int):Int{
    return sum(a,b)
}

fun mul2(a:Int,b:Int):Int = a*b