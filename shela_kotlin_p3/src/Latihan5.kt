fun main() {
    var totalBelanja = 0.0
    println("Status awal -> Total Belanja: Rp$totalBelanja")

    totalBelanja += 3 * 25000
    println("Setelah item A -> Total Belanja: Rp$totalBelanja")

    totalBelanja += 2 * 15000
    println("Setelah item B -> Total Belanja: Rp$totalBelanja")

    totalBelanja -= 10000
    println("Setelah diskon -> Total Belanja: Rp$totalBelanja")

    val biayaLayanan = totalBelanja / 100
    totalBelanja += biayaLayanan
    println("Ditambah biaya layanan (Rp$biayaLayanan) -> Total Belanja: Rp$totalBelanja")

    println("\n==============================================")
    println("Total akhir yang harus dibayar: Rp$totalBelanja")
    println("================================================")
    
}