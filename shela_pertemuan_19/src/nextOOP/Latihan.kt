package nextOOP

interface Electronic {
    val brand: String
    fun turnOn()
    fun turnOff()

    fun cleanDrive(){
        println("Membersihkan Debu Dari Perangkat $brand")
    }
}

class Fan(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas Angin Merk $brand Berputar")
    }

    override fun turnOff() {
        println("Kipas Angin Merk $brand berhenti")
    }

}

class SmartLight(override val brand: String) : Electronic{
    override fun turnOn() {
        println("Smart Light Merk $brand Menyala")
    }

    override fun turnOff() {
        println("Smart Light Merk $brand Mati")
    }

}

fun main() {
    val fan = Fan("Panasonic")
    fan.turnOn()
    fan.turnOff()
    fan.cleanDrive()
    println()

    val light = SmartLight("Philip")
    light.turnOn()
    light.turnOff()
    light.cleanDrive()
}
