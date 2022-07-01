package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    println("start ${Thread.currentThread().name} -----")

    runBlocking(Dispatchers.IO) {
        println("GlobalScope ${Thread.currentThread().name} -----")
        val result1 = func1()
        val result2 = func2()
        println(result1 + result2)

    }

    println("end ${Thread.currentThread().name} -----")

}

suspend fun func1() = withContext(Dispatchers.IO) {
    Thread.sleep(1000)
    println("func1 sleep 1000 in ${Thread.currentThread().name}")
    1
}

suspend fun func2() = withContext(Dispatchers.IO) {
    Thread.sleep(2000)
    println("func1 sleep 2000 in ${Thread.currentThread().name}")
    2
}