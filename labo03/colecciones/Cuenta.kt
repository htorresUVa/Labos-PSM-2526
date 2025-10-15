package es.uva.psmlabos.colecciones

class Cuenta(
    val idCuenta: String,
    val transacciones: MutableList<Transaccion> = mutableListOf(),
    val propietarios: MutableList<Persona> = mutableListOf()
) {

    fun agregarTransaccion(transaccion: Transaccion): Boolean {

        if (transaccion.cantidad > 0) {
            transacciones.add(transaccion)
            return true
        }
        return false
    }

    fun saldoActual(): Double {
        var saldo = 0.0

        for (t in transacciones) {
            if (t.tipo.lowercase() == "depósito") {
                saldo = saldo + t.cantidad
            } else if (t.tipo.lowercase() == "retiro") {
                saldo = saldo - t.cantidad
            }
        }

        return saldo
    }


}