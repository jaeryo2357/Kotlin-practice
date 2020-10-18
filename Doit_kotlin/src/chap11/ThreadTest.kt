package chap11

class SimpleThread : Thread()
{
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

class SimpleRunnable : Runnable
{
    override fun run() {
        println("Current Threads:${Thread.currentThread()}")
    }
}

fun main(){
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()
}