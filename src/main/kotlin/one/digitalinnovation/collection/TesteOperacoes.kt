package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("---------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("---------------------")
    val salariosMaiorQue2500 = salarios.filter { salario ->
        salario > 2500
    }

    salariosMaiorQue2500.forEach { salario -> println(salario) }

    println("---------------------")
    val salariosMaiorQue1500 = salarios.filter { it > 1500 }
    salariosMaiorQue1500.forEach { println(it) }

    println("---------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("---------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("---------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}