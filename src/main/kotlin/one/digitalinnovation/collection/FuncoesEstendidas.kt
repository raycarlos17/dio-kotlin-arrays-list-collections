package one.digitalinnovation.collection

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce { acc, valor ->
    acc + valor
}

fun Array<BigDecimal>.media(): BigDecimal {
    if (this.isEmpty()) {
        return BigDecimal.ZERO
    }
    return this.somatoria() / this.size.toBigDecimal()
}
