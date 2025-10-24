package oop

fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 45,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    val stokPalingSedikit: Map.Entry<String, Int>? = stokBarang.minByOrNull { it.value }

    if (stokPalingSedikit != null) {
        val namaBarang = stokPalingSedikit.key
        val jumlahStok = stokPalingSedikit.value
        println("Barang yang perlu segera direstock adalah : $namaBarang")
        println("Stok $namaBarang adalah : $jumlahStok")
    } else {
        println("Stok barang kosong")
    }

}