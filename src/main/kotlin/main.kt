import test1.User

fun main() {
    var a: String? = null
//    a = "a"
//    println(a.isNullOrEmpty())
//    println(a!!.toString())
//    println(a?.toString())


//    val items = listOf("apple", "banana", "kiwi")
//    for (item in items) {
//        println(item)
//    }
//
//    for (index in items.indices) {
//        println("item at $index is ${items[index]}")
//    }
//
//    for ((index, value) in items.withIndex()) {
//        println("the element at $index is $value")
//    }

    println(null)
    var user: User? = User("first", "last")
    user = null
//    println(user!!.firstName)
    println(user?.firstName)
    println(user?.firstName ?: User("first", "last").lastName)
    var sss: String? = "sss"
    sss = null
    println(sss as? String)
    var bbb: Boolean? = null
    println(bbb == true)

    println(test.TEST_SCOPE2_FIELD2)
    test.testScopeFunc2()

    println(710 / 300f)

    var subList: MutableList<String>? = mutableListOf<String>("aaa")
    subList = null
    var list: MutableList<String> = mutableListOf()
    list.addAll(subList ?: mutableListOf("111"))
    println(list)
}