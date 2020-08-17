package test

fun main() {
    val list = listOf("Apple", "Orange", "Pear", "Grape", "Watermelon")
    val maxLengthFruit = list.maxBy { it.length }
    println(maxLengthFruit)

    val newList = list.filter { it.length <= 5 }.map { it.toUpperCase() }
    for (fruit in newList) {
        println(fruit)
    }
}