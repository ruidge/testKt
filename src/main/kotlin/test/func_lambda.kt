package test


/**
 * https://www.kotlincn.net/docs/reference/lambdas.html
 *
 * 使用lambda表示函数调用，lambda最后一行表示返回值，在{}中
 *
 * (A, B) -> C 表示接受类型分别为 A 与 B 两个参数并返回一个 C 类型值的函数类型。
 * 参数类型列表可以为空，如 () -> A。但 Unit 返回类型不可省略。
 *
 * 如果调用函数的最后一个参数是函数，那么lambda的{}可以放在右括号外面（拖尾lambda）
 *
 * todo:带有接收者的函数字面值
 */
fun main() {
    test_lambda0(0) { -> println("test_lambda0") }
    test_lambda1(1) { i: Int ->
        println(i)
    }
    //一个参数可以用it代替
    test_lambda1(1) {
        println(it)
    }
    test_lambda2(1, 2) { a: Int, b: Int ->
        val result = a + b
//        return@test_lambda2 result
        result
    }

    test_lambda2(1, 2, fun(a: Int, b: Int): Int {
        return a + b
    })

    test_lambda2(2, 2, fun(a: Int, b: Int): Int {
        val result = a + b
        return result * 2
    })
    //函数
    test_lambda2(2, 2, ::add1)
    //拓展函数
    test_lambda2(2, 2, Int::add2)
}

fun test_lambda0(i: Int, callback: () -> Unit) {
    println("$i : " + callback())
}

/**
 * Kotlin 使用类似 (Int) -> Unit 的一系列函数类型来处理函数的声明
 */
fun test_lambda1(i: Int, callback: (Int) -> Unit) {
    callback(i)
}

/**
 * f.invoke(x) 或者直接 f(x)
 */
fun test_lambda2(a: Int, b: Int, func_add: (Int, Int) -> Int) {
    println(func_add(a, b))
    println(func_add.invoke(a, b))
}

fun add1(a: Int, b: Int): Int {
    return a + b
}

class ClassLambda

fun Int.add2(b: Int): Int {
    return this + b
}