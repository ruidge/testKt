package test


fun main() {

    var value: String? = "123"
    value = null

    value?.let {
        println("not null")
        funTest()
    } ?: run {
        println("is null")
    }
    println("----------------------")
    value ?: run {
        println("is null")
        null
    }?.let { println("not null") }
}

fun funTest(): Int? {
    return null
}