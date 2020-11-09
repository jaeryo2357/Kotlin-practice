package chap11

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//runBlocking은 해당 스레드를 점유하여 작업이 종료될때까지 지연시킨다.
fun main() = runBlocking{
    //
    print(Thread.currentThread().name + "list create")

    //List는 collection을 생성하는 것으로
    //List<T>를 반환한다.
    val jobs = List(1000){

        launch {
            delay(1000L)
            println(".")
        }
    }

    //repeat()으로는 값은 반환아니지만 매개변수만큼 반복해서 동작작

   jobs.forEach { it.join() }
}