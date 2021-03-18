package one.digitalinnovation.collection

class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String {
        return """
            Nome:       ${this.nome}
            Salario:    ${this.salario}
            
        """.trimIndent()
    }
}