fun main() {
    val daftarMahasiswa = listOf(
        Pair("Shela", 3.8),
        Pair("Ani", 3.5),
        Pair("Doni", 3.7),
    )

    for (mahasiswa in daftarMahasiswa){
        if(mahasiswa.second > 3.5){
            println("${mahasiswa}")
        }

        val mahasiswaCumlaude = daftarMahasiswa
            .filter { it.second>3.5 }
            .map { it.first}

        println(mahasiswaCumlaude)
    }
}