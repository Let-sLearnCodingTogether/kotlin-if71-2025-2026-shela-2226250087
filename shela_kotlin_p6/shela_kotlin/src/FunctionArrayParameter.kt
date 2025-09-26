fun printBuah(buah: Array<String>) {
    for (fruit in buah) {
        println(fruit)
    }
}
fun main() {
    printBuah(buah = arrayOf("Apel", "Jeruk", "Anggur"))
}