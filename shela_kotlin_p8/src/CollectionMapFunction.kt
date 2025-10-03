fun main() {
    // Immutable
    val buah : Map<String, Int> = mapOf(
        "Orange" to 10,
        "Apple" to 3
    )
    println("Size : ${buah.size}")
    println("is Empty : ${buah.isEmpty()}")
    println("Contain Key : ${buah.containsKey("Orange")}")
    println("Contain Value : ${buah.containsValue(10)}")
    println("Get : ${buah.get("Apple")}")
    println("Get or Default: ${buah.getOrDefault("Pisang", 0)}")
    println(buah.keys)
    println(buah.values)
    println(buah.entries)

    buah.entries.forEach { (key, value) ->
        println("Key : ${key}, value : ${value}")
    }

}