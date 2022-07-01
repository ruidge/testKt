package test


fun main() {
    var ff = FF()
    ff.name = "fff"
    ff.table
    ff.list
    println(ff.name)
}


class FF {
    /**
     * field标识"幕后字段"
     * 外部使用对象 .name 触发get; .name= 触发set, 如果直接使用name会死循环
     * field指的就是当前的这个属性，它不是一个关键字，只是在setter和getter的这个两个特殊作用域中有着特殊的含义
     */
    var name: String = "ff"
        get() {
            println("invoke get()")
            return field
        }
        set(value) {
            println("invoke get()")
            field = value
        }

    /**
     * 幕后属性的场景：对外表现为只读，对内表现为可读可写。
     */
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // 类型参数已推断出
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }

    private var _list: MutableList<String>? = null
    public val list: MutableList<String>
        get() {
            if (_list == null) {
                _list = mutableListOf()
            }
            return _list ?: throw AssertionError("Set to null by another thread")
        }
}