fun main() {
    val mataKuliahWajib : List<String> = listOf(
        "Kotlin",
        "Kalkulus",
        "Algoritma dan Struktur Data"
    )

    println("List Mata Kuliah Wajib : $mataKuliahWajib")
    println("Size List Mata Kuliah Wajib : ${mataKuliahWajib.size}")
    println("Index Pertama Mata Kuliah Wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }
    println("List Mata Kuliah Uppercase : $mataKuliahUppercase")

    val mataKuliahLebihDariNKarakter = mataKuliahWajib.filter {
        it.length > 10
    }
    println("List Mata Kuliah Lebih Dari 10 Karakter : $mataKuliahLebihDariNKarakter")
}