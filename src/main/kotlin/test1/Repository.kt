package test1

object Repository {
    private val _users = mutableListOf<User>()

//    fun getUsers(): List<User> {
//        return _users
//    }

    val users: List<User>
        get() = _users

//    val formattedUserNames: List<String>
//        get() {
//            val userNames: MutableList<String> = ArrayList(users.size)
//            for ((firstName, lastName) in users) {
//                val name = if (lastName != null) {
//                    if (firstName != null) {
//                        "$firstName $lastName"
//                    } else {
//                        lastName
//                    }
//                } else {
//                    firstName ?: "Unknown"
//                }
//                userNames.add(name)
//            }
//            return userNames
//        }

    val formattedUserNames: List<String>
        get() {
            return _users.map { user ->
                val name = if (user.lastName != null) {
                    if (user.firstName != null) {
                        "${user.firstName} ${user.lastName}"
                    } else {
                        user.lastName ?: "Unknown"
                    }
                } else {
                    user.firstName ?: "Unknown"
                }
                name
            }
        }

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        val user4 = User(null, null)
        _users.apply {
            this.add(user1)
            add(user2)
            add(user3)
            add(user4)
        }

    }
}

fun main() {
    Repository.users

    println(Repository.formattedUserNames)
//    println(Repository.getUsers())
    println(Repository.users)
}