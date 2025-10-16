package oop

class MahasiswaFunctionOverloading (val nama: String) {
    fun sayHello(){
        println("Selamat Malam, $nama")
    }

    fun sayHello(word : String){
        println("$word, $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunctionOverloading("Shela")
    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Pagi")
}