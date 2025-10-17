package oop

object DatabaseConnection{
    fun connect(){
        println("Connecting to Database...")
    }
    fun disconnect(){
        println("Disconnecting from Database...")
    }
}

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}