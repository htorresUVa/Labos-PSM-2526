package es.uva.psmlabos


import kotlin.math.*

class ElementoRadiactivo(val nombre: String, val lambda: Double) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ElementoRadiactivo

        if (lambda != other.lambda) return false
        if (nombre != other.nombre) return false

        return true
    }

    override fun hashCode(): Int {
        var result = lambda.hashCode()
        result = 31 * result + nombre.hashCode()
        return result
    }

    override fun toString(): String {
        return "ElementoRadiactivo(nombre='$nombre', lambda=$lambda)"
    }

    fun getSemivida(): Double = ln(2.0) / this.lambda

    fun getProporcionDesintegrados(t: Double): Double = 1.0 - exp(-this.lambda * t)


}

