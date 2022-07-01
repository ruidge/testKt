package test

fun main() {
    val a = 10
    val b: Boolean?
    b = null
//    b = false

    var c: Int? = null
    c = 100;
    c = 200;

    println("hello : $a : $b")
    println("hello : ${add(a, c)}")

    for (i in 0 until 10) {
        println(i)
    }
}


fun add(a: Int, b: Int) {
    a + b;
    return
}

fun largerNumber(param1: Int, param2: Int): Int {
    var value = 0
    if (param1 > param2) {
        value = param1
    } else {
        value = param2
    }
    return value
}

fun largerNumber(param1: Int): Unit {
    when (param1) {
        1 -> {
            print("x == 1")
        }
        2 -> print("x == 2")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }
    return
}

fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 95
    "Lily" -> 100
    else -> 0
}
