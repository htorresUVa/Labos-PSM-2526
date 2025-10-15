package es.uva.psmlabos.colecciones

class Persona(val nombre: String, val cuentas: MutableSet<Cuenta> = mutableSetOf<Cuenta>()) {

    fun agregarCuenta(cuenta: Cuenta): Boolean {
        if (cuenta !in cuentas) {
            cuentas.add(cuenta)
            cuenta.propietarios.add(this)
            return true
        }
        return false
    }


    fun saldoNeto(): Double {
        var saldo = 0.0

        for (cuenta in cuentas){
            saldo = saldo + cuenta.saldoActual()
        }

        return saldo
    }
}