package test2

import com.google.gson.Gson

/**
 * @author: rui.zhang1
 * @date: 2023/7/6
 * @email: rui.zhang1@dmall.com
 * @description:
 */

fun main() {
    val gson = Gson()
    val str = "{\"name\":\"zhang\",\"age\":\"12\",\"name1\":\"name1\",\"name2\":\"name2\"}"
    var o = gson.fromJson(str, Obj::class.java)
    println(gson.toJson(o))
    println(o.name1)
    println(o.name2)
}

class Obj {
    var name: String? = null
    var age: String? = null

    //val的不会作为属性,也不会被gson反序列化
    val name1: String
        get() = "${name}1"
    //var的会作为属性,会被gson反序列化,不过get的时候会转为别的值,如果get返回自己会死循环
    var name2: String? = null
        get() = "${name}2"

}