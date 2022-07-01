package test

open class Base(val name: String) {

    init {
        println("init in Base name is $name")
    }

    open val size: Int =
        name.length.also { println("init size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init {
        println("init Derived")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("init size in Derived: $it") }
}

fun main() {
    Derived("steve", "jobs")
}