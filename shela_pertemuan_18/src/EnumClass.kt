enum class DayOfTheWeek{
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}.${it.name}")
    }

    println()

    println(DayOfTheWeek.valueOf("Senin"))
    println(DayOfTheWeek.valueOf("Selasa"))
    // println(DayOfTheWeek.valueOf("rabu")) //return nya exception karena r nya kecil

    val today = DayOfTheWeek.valueOf("Senin")

    when(today){
        DayOfTheWeek.Senin -> println("Yah, Senin Lagi")
        DayOfTheWeek.Selasa -> println("Hari Selasa")
        DayOfTheWeek.Rabu -> println("Hari Rabu")
        DayOfTheWeek.Kamis -> println("Hari Kamis")
        DayOfTheWeek.Jumat -> println("Hari Jumat")
        DayOfTheWeek.Sabtu, DayOfTheWeek.Minggu -> println("Hari Libur")
        else -> println("Hari Lain")
    }
}