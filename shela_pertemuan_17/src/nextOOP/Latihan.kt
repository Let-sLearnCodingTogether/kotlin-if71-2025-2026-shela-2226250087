package nextOOP

open class Pegawai(val name : String, val gajiDasar : Double){
    open fun hitungGaji() : Double{
        return gajiDasar
    }
}

class Manager(name : String, gajiDasar: Double) : Pegawai(name, gajiDasar){
    override fun hitungGaji(): Double {
        return gajiDasar
    }
}

class Programmer(name : String, gajiDasar: Double) : Pegawai(name, gajiDasar){
    override fun hitungGaji(): Double {
        return gajiDasar
    }
}


fun main() {
//    val manager1 = Manager("Shela", 9000000.00)
//    val programmer1 = Programmer("Andi", 5000000.00)
//    println("Gaji ${manager1.name} = Rp. ${manager1.hitungGaji()}")
//    println("Gaji ${programmer1.name} = Rp. ${programmer1.hitungGaji()}")

    val dataPegawai : List<Pegawai> = listOf(
        Manager("Shela", 9000000.00),
        Programmer("Andi", 5000000.00),
        Programmer("Siti", 4000000.00)
    )

    for (pegawai in dataPegawai){
        println("Nama Pegawai : ${pegawai.name}, Gaji : ${pegawai.gajiDasar}")
    }
}