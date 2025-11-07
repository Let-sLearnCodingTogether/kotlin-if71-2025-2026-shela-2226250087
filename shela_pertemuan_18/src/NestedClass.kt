class Gedung(val nama : String){
    private val alamat : String = "Jalan Sudirman"

    class RuanganRapat{
        fun mulaiRapat(){
            println("Rapat dimulai")
            //println("Rapat di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val ruanganRapat = Gedung.RuanganRapat()
    ruanganRapat.mulaiRapat()
}