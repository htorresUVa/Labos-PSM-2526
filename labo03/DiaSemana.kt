package es.uva.psmlabos

class DiaSemana {

    val diasSemana = arrayOf("Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")

    fun getM(a: Int, m: Int): Int {
        val mesRegular = arrayOf(0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5)
        val mesBisiesto = arrayOf(0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6)

        return if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
            mesBisiesto[m - 1]
        } else {
            mesRegular[m - 1]
        }
    }

    fun getDiaSemana(A: Int, mes: Int, D: Int): String {
        val M = getM(A, mes)

        val parte1 = (A-1) % 7
        val parte2 = (((A-1) / 4) - (3* ((((A-1) / 100) + 1) / 4))) % 7
        val d = (parte1 + parte2 +M + D % 7)% 7

        return diasSemana[d]
    }
}