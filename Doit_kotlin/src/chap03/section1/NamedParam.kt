package chap03.section1

fun main(){

    namedParam(x = 200,z = 100)
    namedParam(z = 150)

    //namedParam(150) error java와 달리 default 값을 마지막에만 선언할 필요는 없지만 호출 시 명시해 주어야한다.
}

fun namedParam(x:Int = 100,y:Int = 200, z : Int)
{
    println(x+y+z)
}