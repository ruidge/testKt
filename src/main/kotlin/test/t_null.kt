package test

fun main() {

    var tt: TNull? = null
//    tt = tt ?: TNull()
    tt = tt ?: TNull("name0")
    tt.name = tt.name ?: "name1"
    tt.funcA()

}

class TNull(var name: String? = null) {

    fun funcA() {
        println("funcA $name")
    }

    init {
        println("init $name")
    }
}
