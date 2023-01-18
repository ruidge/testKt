fun main() {

    var v1 = "2"
    var v2 = "2"

    println(v1 == null)
    println(v1 === v2)

    var b = true
    if (b || printTest()) {
        println("------")
    }

    b = false
    if (b && printTest()) {

    }

//    var list: List<String> = listOf()
//    list.add("11")
//    println(list)
//    list.addAll(emptyList())
//    list = emptyList<String>()
//    println(list)

}

fun printTest(): Boolean {
    println("test")
    return true
}