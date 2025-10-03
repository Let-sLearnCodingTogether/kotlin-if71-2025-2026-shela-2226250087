fun main(){
    val buah : MutableMap<String, Int> = mutableMapOf(
        "Orange" to 10,
        "Apple" to 3
    )

    buah["Orange"] = 10
    //buah.put("Anggur", 12)
    println(buah.entries)

    buah.remove("Orange")
    buah.putAll(mapOf("Anggur" to 2
    ))
    println(buah.entries)

    buah.clear()
    println(buah.entries)
}