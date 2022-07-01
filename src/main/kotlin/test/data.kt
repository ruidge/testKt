package test

import test1.User

/**
 * 在将此类标记为 data 类后，编译器便会自动创建 getter 和 setter。
 * 此外，其还会派生 equals()、hashCode() 和 toString() 函数
 */
data class Cellphone(val brand: String, val price: Double)

private val users: MutableList<User>? = null
fun main() {
    val cellphone1 = Cellphone("Samsung", 1299.99)
    val cellphone2 = Cellphone("Samsung", 1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
    println("cellphone1 equals cellphone2 " + (cellphone1 === cellphone2))
}
