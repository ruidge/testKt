package coroutines

import kotlinx.coroutines.*

fun main() {

    runBlocking(Dispatchers.IO) {
        println("runBlocking ${Thread.currentThread().name} -----")

        val job = launch { // 外层任务，包裹两个协程

            GlobalScope.launch { // 第一个协程
                for (i in 0..10) {
                    println("GlobalScope $i ${Thread.currentThread().name} -----")
                    delay(100)
                }
            }

            launch { // 第二个协程
                for (i in 0..10) {
                    println("normal launch $i ${Thread.currentThread().name} #####")
                    delay(100)
                }
            }
        }

        delay(300); // 延迟一会，让第二个协程能执行3次左右

        job.cancel() // 将外层任务取消了

        delay(2000) // 继续延迟，期望看到GlobalScope能继续运行

    }
}