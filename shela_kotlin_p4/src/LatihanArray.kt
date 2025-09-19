fun main() {
    val days : Array <String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    println("=========================")
    println("Jumlah Hari : ${days.size}")

    println("Hari Pertama : ${days.first()}")
    println("Hari Terakhir : ${days.last()}")

    val indexJumat = days.indexOf("Jumat")
    if (indexJumat != -1) {
        days[indexJumat] = "Jum'at Barokah" // mengubah jumat jadi jumat barokah
        println(days[indexJumat])
    }
    println("=========================")
}