package chap11

import kotlinx.coroutines.*

fun main() {
    val job = GlobalScope.launch {
        delay(1000L)
        println("World")
    }

    println("Hello")
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")
    Thread.sleep(2000L)
    println("job.isActive: ${job.isActive}, completed: ${job.isCompleted}")

   // worksInSerial()
    worksInParallel()
    readLine()
}


suspend fun doWork1(): String {
    println("doWork1")
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    println("doWork2")
    delay(3000)
    return "Work2"
}

private fun worksInSerial() {

    GlobalScope.launch {
        val one = doWork1()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
}

private fun worksInParallel() {

    val one = GlobalScope.async {
        doWork1()
    }

    //현재 async가 실행됨
    val two = GlobalScope.async {
        println("two start")
        doWork2()
    }

    GlobalScope.launch {
        println("awit start")
        val combined = one.await() + "_" + two.await()
        //await 결과 값이 나올 때까지 대기하지만 launch 안에서 대기한다는 뜻
        println("delay")
        println("Kotlin Combined : $combined")
    }
}