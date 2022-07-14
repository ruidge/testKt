package test

const val TEST_SCOPE2_FIELD = 1
const val TEST_SCOPE2_FIELD2 = "TEST_SCOPE2_FIELD2"
val TEST_SCOPE2_FIELD3 = mutableListOf<Any>()

fun testScopeFunc2(): Unit {
    println(TEST_SCOPE2_FIELD2)
}


fun main() {
    testS1()
//    testS2()
}


/**
 * run直接创建代码级作用域
 */
fun testS1() {
    var a = 1
    run {
        var a = 2
        run {
            var a = 3
            println(a)
        }
        println(a)
    }
    println(a)
}

/**
 * with生成的代码块中this是不可变的
 */
fun testS2() {
//    var a = 10
//    with(a) {
//        a = 20
//        println(this)
//        println(a)
//    }
//    with(a) {
//        println(this)
//    }
    var b: Int? = 10
    b?.let {
        b = null
        println(b)
        println(it)
    }
}