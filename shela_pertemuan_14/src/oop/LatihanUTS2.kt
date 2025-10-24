package oop

class Karyawan(val nama: String, val id: String, val gajiPokok: Double) {

    fun tampilkanProfil() {
        println("Nama Karyawan  : $nama")
        println("ID Karyawan    : $id")
        println("Gaji Pokok     : $gajiPokok")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double {
        return (jumlahHariMasuk / 22.0) * gajiPokok
    }
}

fun main() {
    val karyawan1 = Karyawan("Shela", "K001", 5000000.0)
    val karyawan2 = Karyawan("Messi", "K002", 6000000.0)

    karyawan1.tampilkanProfil()
    println("---------------------------")
    karyawan2.tampilkanProfil()

    val gajiKaryawan1 = karyawan1.hitungGajiBulanan(20)
    val gajiKaryawan2 = karyawan2.hitungGajiBulanan(22)

    println("--------------------------------------------------")

    println("Gaji Bulanan Karyawan 1 -> 20 hari: Rp. ${String.format("%.2f", gajiKaryawan1)}")
    println("Gaji Bulanan Karyawan 2 -> 22 hari: Rp. $gajiKaryawan2")
}
