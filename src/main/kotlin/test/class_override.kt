package test

open class Shape() {
    open var r: Int = 0
    open val a: Int = 0
    open fun draw() { /*……*/
    }

    fun fill() { /*……*/
    }
}

open class Circle(
    override var r: Int = 100,
    final override var a: Int = 100
) : Shape() {
    final override fun draw() {

    }
}

class Circle2() : Circle() {
    override var r: Int = 200
//    override var a: Int = 200
//    override fun draw() { /*……*/
//    }
}