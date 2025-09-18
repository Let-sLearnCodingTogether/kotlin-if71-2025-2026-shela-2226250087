/* Data Type In Kotlin
number
boolean
char
string
array
* */
fun main() {
    //Integer Type
    val age : Byte = 20
    val height : Short = 163
    val distance : Int = 86999
    val balance : Long = 3_000_000_000L //Kalau angklanya panjang pake long dan L dibelakangnya
    //Kalau angkanya ga pangjang gausah pake long ->  val balance = 300

    println(age)
    println(height)
    println(distance)
    println(balance)

    //Unsigned Integer
    val uAge : UByte = 20u //kalau unsigned belakangnya harus pake u
    val uHeight : UShort = 163u
    val uDistance : UInt = 86999u
    val uBalance : ULong = 4000000000u

    println(uAge)
    println(uHeight)
    println(uDistance)
    println(uBalance)

    //Format Kode
    // ctrl + alt + l


}