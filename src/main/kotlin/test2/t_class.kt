package test2

/**
 * @author: rui.zhang1
 * @date: 2023/7/13
 * @email: rui.zhang1@dmall.com
 * @description:
 */
//标识open才能被继承
open class C1 {
    //标识open才能被复写
    open var f11: String?
    var f12: String?

    constructor() : this(null, null) {

    }

    constructor(f11: String?, f12: String?) {
        this.f11 = f11
        this.f12 = f12
    }

    fun print() {
        println("f11:$f11;f12:$f12")
    }
}

class C2 {
    var f21: String? = null
    var f22: String? = null

    fun print() {
        println("f21:$f21;f22:$f22")
    }
}

class TestC : C1 {

    constructor() : super() {
    }

    constructor(f11: String?, f12: String?) : super(f11, f12) {
    }

    override var f11: String? = null
}

fun main() {
    val tc = TestC("11", "12")
    tc.f11 = "111"
    tc.print()
}