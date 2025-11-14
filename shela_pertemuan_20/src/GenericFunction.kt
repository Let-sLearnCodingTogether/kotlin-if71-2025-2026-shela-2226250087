// function ini menerima parameter T dan mengembalikan T juga
fun <T> sayHello(param: T) {
    println("Halo, $param")
}

fun main() {
    // memanggil fungsi Generic
    sayHello("Shela")  // T otomatis menjadi String
    sayHello(123)     // T otomatis menjadi Int
    sayHello(true)    // T otomatis menjadi Boolean
}