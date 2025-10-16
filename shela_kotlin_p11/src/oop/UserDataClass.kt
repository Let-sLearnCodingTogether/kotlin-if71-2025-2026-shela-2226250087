package oop

data class User(val name: String, val age: Int)

fun main() {
    val user = User("User 1", 20)
    val userCopy = user.copy()
    val userCopyAge = user.copy(age = 21)
    println(user)
    println(userCopy)
    println(userCopyAge)
}