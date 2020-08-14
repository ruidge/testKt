package test

interface Study {
    fun readBooks()
    fun doHomework() {

    }
}

class Student2(name: String, age: Int) : Student(name, age), Study {
    override fun readBooks() {
        println("$name readBooks()")
    }

    override fun doHomework() {
        println("$name doHomework()")
    }

}

fun main() {
    val student2 = Student2("Jack", 19)
    doStudy(student2)
}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}
