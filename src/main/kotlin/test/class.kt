package test

open class Person (open val name: String, val age: Int) {
    init {
        println("$name : $age")
    }

    fun eat() {
        println("$name is eating. He is $age years old")
    }
}

//open才能被继承
open class Student(val sno: String = "", val grade: Int = 0, override var name: String = "", age: Int = 0) :
    Person(name, age) {
    init {
        println("${this.name} : $age")
    }
}

fun main() {
    var p: Person = Person("p1", 10)
    var s1: Student = Student("s1", 2, "s2", 20)
    var s2: Student = Student("s2", 2)
    var s3: Student = Student()
}