package oop

class MahasiswaConstructorDefaultValue (
    val npm: String,
    val nama: String,
    var ipk: Float = 0.0f // ini default value
){
    init {
        println("Ini Block Init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm = "2226250087",
        nama = "Shela"
    )

    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        npm = "2226250001",
        nama = "Andi"
    )

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 4.0f
    println(mahasiswaPertama.ipk)

    println()

    println(mahasiswaKedua.npm)
    println(mahasiswaKedua.nama)
    println(mahasiswaKedua.ipk)

    mahasiswaKedua.ipk = 3.9f
    println(mahasiswaKedua.ipk)

}