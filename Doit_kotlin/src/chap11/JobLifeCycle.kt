package chap11

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {

    //job은 기본적으로 생명주기 New, Active Completing, Cancelling, Cancelled, Completed
    //부모 Job이 종료되면 자식 job은 모두 종료됨
    val job = GlobalScope.launch {
        println(Thread.currentThread().name + " hello")
        coroutineScope {
            delay(1000L)
            println(Thread.currentThread().name + " world!")
        }
    }

    println("job isActive :" + job.isActive + " isComplete : " + job.isCompleted)

    readLine()
}


