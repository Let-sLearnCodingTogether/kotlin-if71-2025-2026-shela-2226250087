fun main() {
    println("Nama kamu?")
    val name = readln()

    println("Umur kamu")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if(age != null) {
        println("nama kamu : $name")
        println("umur kamu :  $age")
    } else {
        println("umur tidak valid")
    }
}