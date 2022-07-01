package test


//fun main() {
//    val area = genCircleArea(2f)()
//    println(area)
//}
//
//fun genCircleArea(radius: Float): () -> Float {
//    val PI: Float = 3.14f
//
//    return fun(): Float {
//        return PI * radius * radius
//    }
//}

fun main() {
    performClick("button") { -> println("click") }
}

fun performClick(name: String, click: () -> Unit) {
    println("$name click ->")
    click()
}

