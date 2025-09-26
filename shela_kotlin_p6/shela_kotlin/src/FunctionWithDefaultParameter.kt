fun sayHello1(firstName : String, lastName : String = "Tanpa LastName"){
    println("Hello, $firstName $lastName")
}

fun main(){
    sayHello1("Shela", "1")
    sayHello1("MDP")
}