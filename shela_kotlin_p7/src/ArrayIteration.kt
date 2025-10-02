fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2")

    users.forEach {
      println("ForEach : $it")
    }
    users.forEach { user ->
      println("ForEach : $user")
    }

    users.forEachIndexed { index, user ->
        println("ForEach Index:  ${index+1} : $user")
    }
}