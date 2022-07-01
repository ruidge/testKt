package test1

/**
 * 函数
 */
fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "Unknown"
    }
}

/**
 * 成员变量
 */
val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }


fun main() {
    val user1 = User("Jane", "")
    val user2 = User("John", null)
    val user3 = User("Anne", "Doe")
    val user4 = User(null, null)

    println(user1.userFormattedName)
    println(user3.getFormattedName())
}