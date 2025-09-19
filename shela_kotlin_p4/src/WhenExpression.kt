fun main() {
    val finalExam = 'A'
    var nilai = 0
    var tugas1 = 'A'
    val nilaiLulus = arrayOf('A', 'B') //penulisan array

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus Juga")
        'C' -> println("Ya Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    when(finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya Bisa Lulus")
        else -> {
            println("Tidak Lulus")
        }
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya Bisa Lulus")
        else -> println("Tidak Lulus")
    }

    when (tugas1){
        'A' -> nilai = 85
        'B' -> nilai = 75
        'C' -> nilai = 65
        else -> nilai = 45
    }
    println("Nilai : " + nilai)

//    var status = false
//
//    when(finalExam){
//        'A','B' -> status = true
//        else -> status = false
//    }
//    println(status)

    val status = when(finalExam){
        'A','B'-> true
        else -> false
    }
    println(status)

    when(finalExam) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak Lulus")
    }

    when(finalExam){
        is Char -> println("Ya, Ini Char")
        is String -> println("Ya, Ini String")
        !is Char -> println("Bukan Char")
    }



}