fun main() {
    // Immutable
    val animals : Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    // Mutable
    val fruits : MutableSet<String> = mutableSetOf("Apple", "Orange", "Melon")
    println(fruits)

    println("Size Animal : ${animals.size}")
    println("Size Fruits : ${fruits.size}")

    println("isEmpty Animal : ${animals.isEmpty()}")
    println("isEmpty Fruits : ${fruits.isEmpty()}")

    println("Contain Animal: ${animals.contains("Kucing")}")
    println("Contain Fruits : ${fruits.contains("Apple")}")

    println("Contain All Animal : ${animals.containsAll(listOf("Zebra", "Kucing"))}")
    println("Contain All Fruits : ${fruits.containsAll(listOf("Apple", "Melon"))}")

    val animalIterator : Iterator<String> = animals.iterator()
    while (animalIterator.hasNext()) {
        println("Animal : ${animalIterator.next()}")
    }
}