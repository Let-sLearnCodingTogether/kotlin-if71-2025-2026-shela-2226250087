fun main() {
    val mataKuliahPilihan : MutableList<String> = mutableListOf(
        "Kotlin",
        "Logika Fuzzy",
    )
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data"
    )

    mataKuliahPilihan.add("Web II")

    println(mataKuliahPilihan[0])
    println(mataKuliahPilihan[1])
    println(mataKuliahPilihan[2])

    mataKuliahPilihan.add(1, "Web I")
    println(mataKuliahPilihan[1])

    mataKuliahPilihan.removeAt(1)
    println(mataKuliahPilihan)

    val mataKuliah = mataKuliahPilihan + mataKuliahWajib
    println(mataKuliah)
}