
fun main() {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()

    println(myShort)

    val myInt2 : Int = 40000
    val myShort2 : Short = myInt2.toShort()

    println(myShort2)
    println(Integer.toBinaryString( myInt2).padStart(length = 32, padChar = '0'))

    // biner dari 40_000 = 1001110001000000 (range 16 bit)
    // biner karena awalan 1 maka hasil akhir pasti negatif
    // lakukan invert ke biner
    // 01100011 10111111
    // convert to desimal
    // 25535 hasil konversi ke desimal
    // karena rumus complement harus ditambahkan 1 pada hasil convert desimal dari bilangan biner
    // 25536 adalah bilangan desimal
    // karena biner awal dimulai dari 1 maka hasil convert adalah negatif
    // jadi, hasil convert int(32 bit) menjadi short(16bit) adalah -25536


}