package chap02.section2

fun main(args: Array<String>) {
    val number = 10
    var language = "Korean"
    val secondNumber:Int = 20
    language = "English"

    //코틀린은 참조형 변수만 사용한다.

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}