fun main() {
    // custom prefix dari trim margin
    val address2 : String = """
        -Jln. Rajawali
        -Sumatera Selatan
        -Palembang
    """.trimMargin("-")

    println(address2)
}