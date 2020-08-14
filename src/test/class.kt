package test

open class Person(open val name: String, val age: Int) {
    init {
        println("$name : $age")
    }

    fun eat() {
        println("$name is eating. He is $age years old")
    }
}

class Student(val sno: String, val grade: Int, override var name: String, age: Int) : Person(name, age) {
    init {
        println("${this.name} : $age")
    }

    constructor(name: String, age: Int) : this("", 0, name, age) {
    }

    constructor() : this("", 0) {
    }

}

fun main() {
    var p: Person = Person("p1", 10)
    var s1: Student = Student("s1", 2, "s2", 20)
    var s2: Student = Student("s2", 2)
    var s3: Student = Student()
}