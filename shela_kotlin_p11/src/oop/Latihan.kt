package oop

data class GameItem(
    val id: Int,
    val name: String,
    val value: Int,
    val rarity: String
)

fun main() {
    val daftarItem = mutableListOf<GameItem>()

    val item1 = GameItem(1, "Pedang Besi", 100, "Common")
    val item2 = GameItem(2, "Ramuan Kesehatan", 50, "Common")
    val item3 = GameItem(3, "Jubah Bayangan", 500, "Epic")

    daftarItem.add(item1)
    daftarItem.add(item2)
    daftarItem.add(item3)

    println("======================= Daftar Item =======================")
    daftarItem.forEach { println(it) }

    val cursedSword = item1.copy(
        name = "Pedang Besi Terkutuk",
        value = item1.value * 2,
        rarity = "Rare"
    )

    println("\n=============== Item Baru (Copy dari Pedang Besi) ===============")
    println(cursedSword)

    println("\n========== Pedang Besi Asli Tetap Tidak Berubah ==========")
    println(item1)

}