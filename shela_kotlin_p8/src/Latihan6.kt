fun main() {
    val daftarJudulBuku: List<String> = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"
    )

    val koleksiGenre: Set<String> = setOf(
        "Novel",
        "Filsafat",
        "Sejarah",
        "Novel"
    )

    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
    )

    println("--- 1. Inisialisasi Data ---")
    println("List Judul Buku Berhasil dibuat (mengandung duplikat).")
    println("Set Genre Berhasil dibuat (hanya berisi nilai unik).")
    println("Map Inventaris Buku Berhasil dibuat (key unik).")
    println("-------------------------------------------------------\n")

    println("--- 2. Manipulasi dan Analisis Data ---")
    val isbnDicari = "978-979-3062-79-2"
    val judulDicari = inventarisBuku[isbnDicari]
    println("Judul Buku dengan ISBN $isbnDicari adalah: $judulDicari")

    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku Baru 'Atomic Habits' Berhasil ditambahkan")

    println("Isi Inventaris Sekarang: $inventarisBuku")
    println("Jumlah Genre Unik yang Ada di Toko : ${koleksiGenre.size}\n")

    println("Daftar Semua Judul Buku yang Tercatat:")
    for (judulBuku in daftarJudulBuku) {
        println("- $judulBuku")
    }
    println("--------------------------------------\n")

}