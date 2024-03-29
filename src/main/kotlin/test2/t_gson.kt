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
    val str = "{\"name\":\"rui.zhang\",\"age\":\"12\",\"name1\":\"name1\",\"name2\":\"name2\"}"
    var o = gson.fromJson(str, Obj::class.java)
    println(gson.toJson(o))
    println(o.name1)
    println(o.name2)
    o.age = "22"
    o.printAge()
}

open class ObjP {
    var age: String? = null
}

class Obj : ObjP() {
    //private可以被gson反序列化
    private var name: String? = null

    //如果下发null,则为null;如果没下发,则为false
    var isMale: Boolean? = false

    //val的不会作为属性,也不会被gson反序列化
    val name1: String
        get() = "${name}1"

    //var的会作为属性,会被gson反序列化,不过get的时候会转为别的值,如果get返回自己会死循环
    var name2: String? = null
        get() = "${name}2"

    fun printAge() {
        println("$age")
    }

}