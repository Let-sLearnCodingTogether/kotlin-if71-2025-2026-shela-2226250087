// <T> adalah parameter tipe
class ExampleGeneric1<T>(val data: T)

fun main() {
    // kita tentukan T adalah Int
    val kotakAngka = ExampleGeneric1<Int>(100)

    // kita tentukan T adalah String
    val kotakKata = ExampleGeneric1<String>("Halo")

    // manfaat pertama: tidak perlu casting
    // kotlin sudah tahu bahwa kotakAngka.data pasti Int.
    val hasil = kotakAngka.data
    println(hasil + 10)

    // manfaat kedua: pengecekan Kompilasi
    // baris di bawah ini akan ERROR MERAH di editor Anda sebelum dijalankan.
    // kotlin mencegah Anda melakukan kesalahan.
    // val error = kotakKata.data + 10 // Error: Unresolved reference for String
}