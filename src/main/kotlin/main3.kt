fun main() {

    var value: String? = "123"
    value = null

    value?.let {
        println("not null")
        ""
    } ?: run {
        println("is null")
    }

    (value ?: run {
        println("is null")
        null
    })?.let { println("not null") }
}
