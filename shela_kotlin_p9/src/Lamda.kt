fun main() {
    val jumlahkan = { a:Int, b:Int->a+b }

    println(jumlahkan(5,10))

    val angka = listOf<Int>(5,10,5)
    val y = angka.map{ n ->
        n * 2
    }
    val x = angka.map{
        it * 2
    }
    println(x)
    println(y)
}