package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario(
        nome = "João",
        salario = 1000.0,
        tipoContratacao = "CLT"
    )

    val pedro = Funcionario(
        nome = "Pedro",
        salario = 2000.0,
        tipoContratacao = "PJ"
    )

    val maria = Funcionario(
        nome = "Maria",
        salario = 4000.0,
        tipoContratacao = "CLT"
    )

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { funcionario -> println(funcionario) }

    println("----------------------")
    funcionarios.forEach { println(it) }

    println("----------------------")
    println(funcionarios.find { funcionario ->
        funcionario.nome == "Maria"
    })

    println("----------------------")
    println(funcionarios.find { it.nome == "Pedro" })

    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("----------------------")
    funcionarios.sortedBy { it.nome }.forEach { println(it) }

    println("----------------------")
    funcionarios.sortedBy { funcionario -> funcionario.salario }.forEach { funcionario -> println(funcionario) }

    println("----------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }

    println("----------------------")
    funcionarios.groupBy { funcionario ->
        funcionario.tipoContratacao
    }.forEach { funcionario ->
        println(funcionario)
    }
}

