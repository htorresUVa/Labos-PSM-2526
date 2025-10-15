package es.uva.psmlabos.colecciones

class Banco {

    val cuentasPorPersona: MutableMap<Persona, MutableSet<Cuenta>> = mutableMapOf()
    val cuentasPorId: MutableMap<String, Cuenta> = mutableMapOf()

    fun agregarPersona(persona: Persona): Boolean {

        if (!cuentasPorPersona.containsKey(persona)) {
            cuentasPorPersona[persona] = mutableSetOf<Cuenta>()
            return true
        }


        return false

    }

    fun agregarCuenta(persona: Persona, cuenta: Cuenta): Boolean {
        if (!cuentasPorPersona.containsKey(persona)) agregarPersona(persona)

        val cuentasPersona = cuentasPorPersona[persona]!!

        val added = cuentasPersona.add(cuenta)

        if (added){
            persona.agregarCuenta(cuenta)
            cuentasPorId[cuenta.idCuenta] = cuenta
        }

        return added


    }

    fun obtenerCuentas(persona: Persona): Set<Cuenta> = cuentasPorPersona[persona] ?: emptySet()

    fun buscarCuentaPorId(idCuenta: String): Cuenta? = cuentasPorId[idCuenta]
}

fun main() {
    // Crear el banco
    val banco = Banco()

    // Crear personas
    val persona1 = Persona("Alice")
    val persona2 = Persona("Bob")

    // Agregar personas al banco
    banco.agregarPersona(persona1)
    banco.agregarPersona(persona2)

    // Crear cuentas
    val cuenta1 = Cuenta("001")
    val cuenta2 = Cuenta("002")

    // Asignar cuentas a personas
    banco.agregarCuenta(persona1, cuenta1)
    banco.agregarCuenta(persona2, cuenta2)
    banco.agregarCuenta(persona1, cuenta2) // Cuenta compartida entre Alice y Bob

    // Crear transacciones
    val transaccion1 = Transaccion("depósito", 1000.0, "2024-10-15")
    val transaccion2 = Transaccion("retiro", 200.0, "2024-10-16")

    // Agregar transacciones a las cuentas
    cuenta1.agregarTransaccion(transaccion1)
    cuenta2.agregarTransaccion(transaccion2)

    // Calcular y mostrar el saldo neto de Alice
    println("Saldo neto de Alice: ${persona1.saldoNeto()}€")

    // Calcular y mostrar el saldo neto de Bob
    println("Saldo neto de Bob: ${persona2.saldoNeto()}€")

    // Buscar una cuenta por ID y mostrar el saldo actual
    val cuentaBuscada = banco.buscarCuentaPorId("002")
    println("Saldo actual de la cuenta 002: ${cuentaBuscada?.saldoActual()}€")
}