package test

import test1.User


fun main() {
//    test1()
    test2()
    println(TEST_SCOPE2_FIELD2)
    testScopeFunc2()
}

/**
 * let和run都是拓展函数,使用类似,使用对象let是it,run是this,返回lambda表达式结果
 * 一般用于lambda处理输入并返回输出
 */
fun test1() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val result = numbers/*.map { it.length }*/.filter { it.length > 3 }.let {
        println(it)
        "aa"
        it.last()
        // 如果需要可以调用更多函数
    }
    println(result)
}

/**
 * apply是拓展函数,使用对象是this,返回对象本身
 * also是拓展函数,使用对象是it,返回对象本身
 */
fun test2() {
    val adam = User("", "").also { println(it) }
        .apply {
            firstName = "Adam"
            lastName = "Zhang"
        }.also { println(it) }
    println(adam)
}