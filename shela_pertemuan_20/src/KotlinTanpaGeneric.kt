class ExampleGeneric(val data: Any)

fun main() {
    val kotakAngka = ExampleGeneric(100)
    val kotakKata = ExampleGeneric("Shela")

    // masalah pertama: kita harus melakukan casting manual (konversi tipe)
    // kita harus memaksa compiler percaya bahwa data adalah Int
    val hasil = kotakAngka.data as Int
    println(hasil + 10)

    // masalah kedua: rawan error runtime
    // compiler tidak akan protes, tapi aplikasi akan CRASH saat dijalankan
    // karena kita mencoba mengubah String ("Shela") menjadi Int.
    val errorNanti = kotakKata.data as Int
}