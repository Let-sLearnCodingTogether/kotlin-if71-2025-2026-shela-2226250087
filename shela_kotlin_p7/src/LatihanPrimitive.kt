fun latihanPrimitive() {
    val nilai: IntArray = intArrayOf(80, 90, 99, 40)

    val total = nilai.sum()

    val rataRata = nilai.average()

    println("Total: $total")
    println("Rata-rata: $rataRata")
}

fun main() {
    latihanPrimitive()
}