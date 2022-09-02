package test

fun main() {

    var userOwner: UserOwner = UserOwner()

    var result: User? = userOwner.findBy("id")("i11")
    println(result)
    result = userOwner.findBy("name")("n12")
    println(result)
    result = userOwner.find {
        it.id == "i15"
    }
    println(result)
    result = userOwner.find {
        it.name == "n14"
    }
    println(result)
}

data class User(val id: String, val name: String, val age: Int)

class UserOwner {
    val users: MutableList<User> = mutableListOf()

    init {
        users.apply {
            add(User("i11", "n11", 11))
            add(User("i12", "n12", 12))
            add(User("i13", "n13", 13))
            add(User("i14", "n14", 14))
            add(User("i15", "n15", 15))
        }
    }

    fun findById(id: String): User? {
        var result: User? = null
        for (user in users) {
            if (user.id == id) {
                result = user
                break
            }
        }
        return result
    }

    fun findByName(name: String): User? {
        var result: User? = null
        for (user in users) {
            if (user.name == name) {
                result = user
                break
            }
        }
        return result
    }

    fun findByAge(age: Int): User? {
        var result: User? = null
        for (user in users) {
            if (user.age == age) {
                result = user
                break
            }
        }
        return result
    }

    fun findBy(filter: String): (String) -> User? {
        var result: User? = null
        when (filter) {
            "id" -> return fun(value: String): User? {
                var result: User? = null
                for (user in users) {
                    if (user.id == value) {
                        result = user
                        break
                    }
                }
                return result
            }
            "name" -> return { value: String ->
                var result: User? = null
                for (user in users) {
                    if (user.name == value) {
                        result = user
                        break
                    }
                }
                result
            }
        }
        return {
            null
        }
    }

    fun find(filter: (user: User) -> Boolean): User? {
        var result: User? = null
        for (user in users) {
            if (filter(user)) {
                result = user
                break
            }
        }
        return result
    }

}

