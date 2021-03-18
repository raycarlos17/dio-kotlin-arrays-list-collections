package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { salario -> println(salario) }

    println("---------------------")
    salarios.sort()
    salarios.forEach { salario -> println(salario) }

    println("---------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] += salario * 0.10
    }

    salarios.forEach { println(it) }

    println("---------------------")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
    println("---------------------")
    salarios2.forEach { salario -> println(salario) }
}