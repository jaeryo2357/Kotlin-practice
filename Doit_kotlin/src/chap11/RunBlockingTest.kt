package chap11

import kotlinx.coroutines.*

suspend fun doWork() : String {
    delay(1000L)
    return "Work"
}

//runBolcking은 현재 스레드를 블로킹해서 코루틴이 완료될때까지 기다린다.
fun main() = runBlocking<Unit> {

    val job = launch {
        //바로 실행
        delay(1000L)
        println("World!")
    }

    println("Hello")
    //join을 사용안해도 명시적으로 기다림을 명령
    //job.join()  runBlocking 아닐때는 필요할듯

    val job2 = launch(start = CoroutineStart.LAZY) {
        print("늦은 시작")
    }

    println("코루틴 시작 필요할때 하기")

    //LAZY는 start와 await를 호출할때 시작
    job2.start()
}
