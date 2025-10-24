package oop

// library yang kita tidak punya akses
class UserProfile1(val username : String){

}

fun UserProfile1.usernameToUppercase() : String{
    return this.username.uppercase()
}

fun main() {
    val user1 = UserProfile1("Shela")
    println(user1.usernameToUppercase())
}