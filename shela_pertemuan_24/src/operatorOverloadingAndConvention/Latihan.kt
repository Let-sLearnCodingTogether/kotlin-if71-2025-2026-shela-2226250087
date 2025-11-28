package operatorOverloadingAndConvention

data class Mana(var current: Int, var max: Int) {

    operator fun plus(other: Mana): Mana {
        val newMax = if (this.max > other.max) this.max else other.max

        var newCurrent = this.current + other.current
        if (newCurrent > newMax) {
            newCurrent = newMax
        }

        return Mana(newCurrent, newMax)
    }


    operator fun inc(): Mana {
        var newCurrent = this.current + 10
        if (newCurrent > this.max) {
            newCurrent = this.max
        }
        this.current = newCurrent
        return this
    }

    operator fun minus(value: Int): Mana {
        var newCurrent = this.current - value
        if (newCurrent < 0) {
            newCurrent = 0
        }
        return Mana(newCurrent, this.max)
    }
}


fun main() {
    var mana1 = Mana(50, 100)
    var mana2 = Mana(20, 50)

    println("Operator +")
    val resultPlus = mana1 + mana2
    println(resultPlus)

    println("\nOperator ++")
    mana1++
    println(mana1)

    println("\n Operator -")
    val resultMinus = mana1 - 30
    println(resultMinus)
}
