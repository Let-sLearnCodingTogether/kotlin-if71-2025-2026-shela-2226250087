package FunctionalProgramming

// contoh yang pure function
fun addPureFunction(a : Int, b : Int) : Int = a + b

// contoh yang inpure function
var count = 0
fun addInpureFunction(a : Int) : Int {
    count += 1
    return a + count
}

fun main(){
    addPureFunction(1,2) //3
    addPureFunction(1,2) //3
    addPureFunction(1,2) //3

    println(addInpureFunction(1)) //2
    println(addInpureFunction(1)) //3
}
