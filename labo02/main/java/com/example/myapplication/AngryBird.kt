package com.example.myapplication

import kotlin.math.*

val g = 9.8

class AngryBird(id: String, velocidad: Double, angulo: Double) {
    private val id = id
    private var v: Double = velocidad


    val vx = v * cos(toRadianes(angulo))
    val vy = v * sin(toRadianes(angulo))

    val thmax = vy / g

    val tv = getTiempo()

    val h = getAltura()

    val d = getDistancia()

    fun getTiempo(): Double = 2 * thmax

    fun getAltura(): Double = vy.pow(2) / (2 * g)

    fun getDistancia(): Double = vx * tv

    fun toRadianes(grados: Double) = grados * PI / 180

}