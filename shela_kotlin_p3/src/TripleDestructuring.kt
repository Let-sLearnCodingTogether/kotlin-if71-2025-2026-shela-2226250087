fun main() {
    val firstUser : Triple<String, Byte, String> = Triple("User 1", 20, "Female" )

    //destructuring
    val (username, age, gender) = firstUser

    println(username)
    println(age)
    print(gender)
}