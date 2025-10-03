fun main() {
    // Immutable
    val buah : Map<String, Int> = mapOf(
        "Orange" to 10,
        "Apple" to 3
    )
    println(buah["Orange"])

    // Mutable
    val buah2 : MutableMap<String, Int> = mutableMapOf(
        "Orange" to 10,
        "Apple" to 3
    )
    println(buah2["Apple"])
}