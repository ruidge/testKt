fun main() {

    var value: String? = "123"
    value = null

    println(value?.toString())

    var ct: ClTest? = ClTest()
    ct = null
    ct?.s = "12"
    println(ct?.s)

    println("--------")
    println(null == true)
    println(null == false)
}

class ClTest(
    var i: Int = 0,
    var s: String = ""
) {
}