package oop

fun main() {
    val person = object {
        val name = "Shela"
        val age = 21
        fun greet() : String {
            return "Hello, $name yang Berusia $age"
        }
    }
    println(person.greet())
}