fun main(args: Array<String>) {
    println("Enter first number")
    val a = readLine()

    println("Enter Second Number")
    val b = readLine()

    println("Dengan nil first number = $a dan nil second number = $b ")
    a?.let { newA ->
        b?.let { newB ->
            println("nilai penjumlahan ${penjumlahan(newA.toInt(), newB.toInt())}")
            println("nilai pengurangan " + pengurangan(newA.toInt(), newB.toInt()))
            println("Nil Perkalian " + perkalian(newA.toInt(), newB.toInt()))
            println("nil pembagian ${pembagian(newA.toInt(), newB.toInt())}")
            println("Nil Maks " + nilmaks(newA.toInt(), newB.toInt()))
        }
    }

}

fun penjumlahan(a: Int, b: Int): Int = a + b
fun pengurangan(a: Int, b: Int): Int = a - b
fun perkalian(a: Int, b: Int): Int = a * b
fun pembagian(a: Int, b: Int): Int = a / b
fun nilmaks(a: Int, b: Int): Int {
    return if (a >= b) {
        a
    } else {
        b
    }
}