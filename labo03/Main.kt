package es.uva.psmlabos

class Main {


}

fun r01() {

    val TIME = 1e12

    val uranio = ElementoRadiactivo("Uranio 235", 3.1229827968E-17)
    val rubidio = ElementoRadiactivo("Rubidio 87", 4.5040067466E-19)
    val radio = ElementoRadiactivo("Radio 226", 1.3720070489E-11)
    val uranio238 = ElementoRadiactivo("Uranio 238", 4.9193269749E-18)
    val calcio = ElementoRadiactivo("Calcio 41", 2.1339371771E-13)
    val cesio = ElementoRadiactivo("Cesio 137", 7.3094622293E-10)


    val elementos = listOf<ElementoRadiactivo>(uranio, rubidio, radio, uranio238, calcio, cesio)

    elementos.forEach { elementoRadioactivo ->
        print("\nElemento Radioacito: ${elementoRadioactivo.nombre}, " +
                "lambda: ${elementoRadioactivo.lambda}\n\t" +
                "Semivida: ${elementoRadioactivo.getSemivida()}\t" +
                "Proporción: ${elementoRadioactivo.getProporcionDesintegrados(TIME)}")

    }
}


fun main(){
    print("Introduce el dia (int): ")
    val dia = readln().toInt()

    print("Introduce el mes (int): ")
    val mes = readln().toInt()

    print("Introduce el año (int): ")
    val year = readln().toInt()

    println("El dia es ${DiaSemana().getDiaSemana(year, mes, dia)}")


}