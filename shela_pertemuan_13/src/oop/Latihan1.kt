package oop

class PersegiPanjang(val panjang : Double, val lebar : Double){
    val luas: Double
        get() = panjang * lebar
}

fun main() {
    val persegi = PersegiPanjang(5.0, 3.0)
    println("Panjang Persegi Panjang: ${persegi.panjang}")
    println("Lebar Persegi Panjang: ${persegi.lebar}")
    println("Luas Persegi Panjang: ${persegi.luas}")
}