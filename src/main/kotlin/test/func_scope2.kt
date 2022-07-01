package test

const val TEST_SCOPE2_FIELD = 1
const val TEST_SCOPE2_FIELD2 = "TEST_SCOPE2_FIELD2"
val TEST_SCOPE2_FIELD3 = mutableListOf<Any>()

fun testScopeFunc2(): Unit {
    println(TEST_SCOPE2_FIELD2)
}

fun main() {
}
