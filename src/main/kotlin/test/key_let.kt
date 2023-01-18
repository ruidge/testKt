package test


fun main() {

    var value: String? = "123"
//    value = null

    //两者都可实现类似 if (value != null) {}else{}的逻辑,
    //第一种需要确定第一块最后一行的返回值为非null,避免走进第二块.(Unit也算非null)
    //第二种需要确定第一块最后一行的返回值为null,避免走进第二块.
    value?.let {
        println("not null")
        funTest()
        Unit
    } ?: run {
        println("is null")
    }
    println("----------------------")
    (value ?: run {
        println("is null")
        null
    })?.let {
        println("not null")
    }
}

fun funTest(): Int? {
    return null
}