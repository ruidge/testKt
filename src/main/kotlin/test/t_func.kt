package test

import printGson

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    printGson(array)

    //map出结果
    printGson(array.map { it >= 5 })
    //过滤结果
    printGson(array.filter { it >= 5 })
    //过程会生成2个列表
    printGson(array.map { it * 2 }.filter { it >= 5 })
    //asSequence只生成1个列表,调用.toList()才生成列表
    printGson(array.asSequence().map { print("map($it) "); it * 2 }
        .filter { print("filter($it) "); it <= 8 }.toList())
}
