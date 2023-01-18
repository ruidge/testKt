package test

fun main() {

    val name1 : String by lazy {
        println("name1 lazy")
        "zhang"
    }

    val name2 : String by lazy {
        println("name2 lazy")
        "$name1 san"
    }


//    println(name1)
    println(name2)
    println(name2)
    println(name2)
}


