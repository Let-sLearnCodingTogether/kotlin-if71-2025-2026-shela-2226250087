class Gedung2(val nama : String){ //outer class
    private val alamat : String = "Jalan Sudirman"

    inner class RuanganRapat{
        fun mulaiRapat(){
            println("Rapat dimulai")
            println("Rapat di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val gedungA = Gedung2(nama = "Universitas MDP")
    val ruangRapat = gedungA.RuanganRapat()
    ruangRapat.mulaiRapat()
}