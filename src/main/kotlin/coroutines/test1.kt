package coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking(Dispatchers.IO) {
        println("runBlocking ${Thread.currentThread().name} -----")

        val job1 = async {
            for (i in 0..10) {
                println("normal launch $i ${Thread.currentThread().name} #####")
                delay(100)
            }
            10 // 注意这里的返回值
        }

        val job2 = async {
            for (i in 0..10) {
                println("normal launch $i ${Thread.currentThread().name} -----")
                delay(100)
            }
            20 // 注意这里的返回值
        }

        println(job1.await() + job2.await())

        println("all job finished")

    }
}