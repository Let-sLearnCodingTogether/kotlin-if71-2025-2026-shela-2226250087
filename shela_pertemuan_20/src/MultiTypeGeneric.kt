fun main() {
    // definisi: Map<K, V>
    // K (Key) kita set sebagai String
    // V (Value) kita set sebagai Integer
    val daftarHarga: Map<String, Int> = mapOf(
        "Apel" to 5000,
        "Jeruk" to 7000,
        "Mangga" to 12000
    )

    // iterasi Generic Map
    // kotlin otomatis tahu 'k' adalah String dan 'v' adalah Int
    for ((k, v) in daftarHarga) {
        println("$k harganya Rp $v")
    }
}