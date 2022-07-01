package test

fun main() {
    val list1 = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    list1.add("Watermelon")

    val list2: MutableList<String> = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    list2.add("Watermelon")

    val map = HashMap<String, Int>()
    map["Apple"] = 1
    map["Banana"] = 2
    map["Orange"] = 3
    map["Pear"] = 4
    map["Grape"] = 5

    val number: Int? = map["Apple1"]


    val list = listOf("Apple", "Orange", "Pear", "Grape", "Watermelon")
    //最初版
    val newList = list.map({ a -> a.toUpperCase() })
    //只有一个参数并且是lambda的时候省略()
//    val newList = list.map { a -> a.toUpperCase() }
    //it直接表示lambda的一个参数
//    val newList = list.map { it.toUpperCase() }
    for (fruit in newList) {
        println(fruit)
    }


    val anyResult = list.any { it.length <= 5 }
    val allResult = list.all { it.length <= 5 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)


    var a : Int? = null
}
