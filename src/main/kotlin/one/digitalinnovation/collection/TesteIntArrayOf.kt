package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("Tamanho do array: ${values.size}")
    println("---------------")
    values.forEach {
        println(it)
    }

    println("---------------")
    values.sort()
    values.forEach {
        println(it)
    }
}