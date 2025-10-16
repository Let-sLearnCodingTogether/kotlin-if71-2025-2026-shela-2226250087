package oop

class MahasiswaConstructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor(
        npm = "2226250087",
        nama = "Shela",
        ipk = 4.0f,
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 3.9f
    println(mahasiswaPertama.ipk)
}