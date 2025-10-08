package com.example.myapplication

fun reto01() {
    val p1 = CapituloSerie("Los Simpson", 1, 10)
    val p2 = CapituloSerie("Juego de Tronos", 1, 5)
    val p3 = p2

    println("p1 antes = $p1")
    println("p2 antes = $p2")
    println("p3 antes = $p3")

    // Comparar objetos y referencias
    println("p1 y p2 son el mismo objeto = ${p1 === p2}")
    println("p1 y p2 son objetos iguales = ${p1 == p2}")
    println("p1 y p3 son el mismo objeto = ${p1 === p3}")
    println("p1 y p3 son objetos iguales = ${p1 == p3}")
    println("p3 y p2 son el mismo objeto = ${p3 === p2}")
    println("p3 y p2 son objetos iguales = ${p3 == p2}")

    // Manejo de nullable types
    var p1Mutable = p1
    var p2Nullable: CapituloSerie? = p2

    // Usamos Elvis para manejar null
    val resultado = p2Nullable ?: CapituloSerie("Desconocido", 0, 0)
    println("Resultado con operador Elvis: $resultado")

    // Forzar valores nulos
    p1Mutable = p2Nullable!!  // Aseguramos que no es nulo aquí
    p2Nullable = null  // Ahora sí es null

    try {
        p1Mutable = p2Nullable!!  // Esto lanzará NullPointerException
    } catch (e: NullPointerException) {
        println("Excepción capturada: ${e.message}")
    }

    // Resultado final
    println("p1 después = $p1Mutable")
    println("p2 después = $p2Nullable")
    println("p3 después = $p3")
}



fun main() {
    print("Introduzca la velocidad inicial de disparo (real, cuidado con la coma decimal) = ")
    val velocidad =
        readlnOrNull()?.toDoubleOrNull() ?: error("Valor no válido para la velocidad")

    print("Introduzca el angulo de disparo (real, cuidado con la coma decimal) = ")
    val angulo = readlnOrNull()?.toDoubleOrNull() ?: error("Valor no válido para el ángulo")

    val ab = AngryBird("Pajaro Bomba", velocidad, angulo)
    println(ab.toString())

    println("Tiempo = ${ab.getTiempo()}")
    println("Altura maxima = ${ab.getAltura()}")
    println("Distancia = ${ab.getDistancia()}")
}