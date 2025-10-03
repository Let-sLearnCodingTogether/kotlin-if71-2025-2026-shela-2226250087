fun main() {
    // Mutable
    val animals : MutableSet<String> = mutableSetOf()

    // Add
    animals.add("Zebra")
    animals.add("Kucing")
    println(animals)

    // Remove
    animals.remove("Kucing")
    println(animals)

    // Add All
    val addAnimals = setOf("Gajah", "Harimau", "Zebra")
    animals.addAll(addAnimals)
    println("Setelah Di AddAll: $animals")

    // Remove All
    val removeAnimals = setOf("Gajah", "Harimau")
    animals.removeAll(removeAnimals)
    println("Setelah di RemoveAll: $animals")

    // Clear
    animals.clear()
    println("Setelah clear: $animals")

    // Retain All
    val retainAnimals = setOf("Zebra", "Harimau")
    animals.retainAll(retainAnimals)
    println("Setelah di RetainAll: $animals")

}