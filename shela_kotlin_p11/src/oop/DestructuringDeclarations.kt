package oop

data class Kendaraan(val merek: String, val tahun: Int)

fun main() {
    val tayo = Kendaraan("Tayo", 2015)

    // println(tayo.merek)
    // println(tayo.tahun)
    val(merek, tahun) = tayo //destructuring
    println(merek)
    println(tahun)
}