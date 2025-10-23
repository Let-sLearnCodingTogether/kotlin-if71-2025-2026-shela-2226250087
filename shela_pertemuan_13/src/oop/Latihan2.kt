package oop

class Mahasiswa {
    var ipk : Double = 0.0
        set(value) {
            field = if(value < 0.0) 0.0 else if(value > 4.0) 4.0 else value
        }
}

fun main() {
    val ipkMhs = Mahasiswa()
    ipkMhs.ipk = -3.8
    println("IPK Negatif : ${ipkMhs.ipk}")

    ipkMhs.ipk = 4.5
    println("IPK Lebih dari 4.0 : ${ipkMhs.ipk}")

    ipkMhs.ipk = 3.9
    println("IPK Normal : ${ipkMhs.ipk}")
}