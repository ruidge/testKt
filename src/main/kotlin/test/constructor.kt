package test

open class Person0 constructor(name: String, age: Int?) {
    val name: String = name
    val age: Int? = age
    val age1: Int? = age
}

open class Person1 constructor(name: String, age: Int?) {
    val name: String
    val age: Int?

    init {
        this.name = name
        this.age = age
    }
}

class Person2(var name: String, var age: Int)

class Person3(name: String) {

    constructor(name: String, age: Int) : this(name) {

    }

    constructor(name: String, age: Int, address: String) : this(name, age) {

    }
}

class Person4 constructor(name: String, age: Int, address: String) : Person1(name, age) {

    constructor(name: String, age: Int, address: String, birth: String) : this(name, age, address)

}

fun main() {
    println(Person0("p0", 0).name)
    println(Person1("p1", 0).name)
}