package test

import test1.User



fun main() {
    val stu1 = Stu1("stu1", 0)
    stu1.name = "stu1New"
    stu1.gradeUpward()
    stu1.printInfo()

    val stu2 = Stu2("stu2", 0)
    stu2()
}

class Stu1(var name: String, var grade: Int) {

    fun gradeUpward() {
        grade++
    }

    fun printInfo() {
        println("name is :$name, grade is $grade")
    }
}

fun Stu2(name: String, grade: Int): () -> Any {
    var _name: String = name
    var _grade: Int = grade

    fun gradeUpward() {
        _grade++
    }

    fun printInfo() {
        gradeUpward()
        println("name is :$_name, grade is $_grade")
    }

    return ::printInfo
}

