package oop

import kotlin.properties.Delegates

class NilaiMahasiswa{
    var nilai : Float by Delegates.vetoable(0.0f){
        property, oldValue, newValue ->
        if (newValue > 0.0f && newValue <= 100f){
            println("Nilai berhasil diubah")
            true
        } else{
            println("Nilai harus lebih besar dari 0 dan kecil sama dengan 100")
            false
        }
    }
}

fun main() {
    val nilaiMhs = NilaiMahasiswa()

    nilaiMhs.nilai = -10f // 0.0
    println(nilaiMhs.nilai)

    nilaiMhs.nilai = 80f // 80.0
    println(nilaiMhs.nilai)
}