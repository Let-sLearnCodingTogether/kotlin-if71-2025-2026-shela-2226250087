fun main() {
    val ages : Array<Int> = arrayOf(60, 25, 30, 40, 50)

    println("Ages : ${ages.joinToString()}")

    //ages.sort() //urutan berubah dari kecil ke besar
    ages.sorted() //urutan tetap (tidak berubah)
    //println("Age Sort : ${ages.joinToString()}")
    println("Age Sorted : ${ages.joinToString()}")

    ages.reverse()
    println("Age Reverse : ${ages.joinToString()}")

    println("Age Slice : ${ages.slice(2..4).joinToString()}")
}