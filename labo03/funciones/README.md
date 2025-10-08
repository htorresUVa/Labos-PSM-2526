# Funciones para Automatizar Tareas: la máquina de café ☕️

## Automatizando el Café con Kotlin
Eres un desarrollador, quien ama el café y necesitas simplificar su preparación. En lugar de hacer todo manualmente, podrías simplemente presionar un botón en tu máquina de café. En Kotlin, ese botón es una función. ☕️

## Creando la Función `makeCoffee`
Vamos a crear una función llamada `makeCoffee` que realiza todos los pasos necesarios para preparar café. Por ejemplo:

``` Kotlin
fun makeCoffee() {
    println("Comprar granos de café")
    println("Moler los granos")
    println("Calentar agua a 90°C")
    println("Agregar agua caliente a los granos molidos")
    println("Presionar el café")
}
```

Esta función agrupa todos los pasos y te permite reutilizar el código cada vez que necesites café.

## Ejecutando la Función
Para utilizar nuestra función, la llamamos desde `main()`.

```Kotlin
fun main() {
    makeCoffee()
}
```

Esto imprimirá en la consola todos los pasos para preparar café, facilitando el proceso.

## Parametrizando la Función
Podemos hacer nuestra función más útil añadiendo un parámetro `strength` (fuerza) de tipo `String` para personalizar el café. Intenta añadir este parámetro tú mismo. ☕️✨

<details>
  <summary>Haz clic para ver el código</summary>

```Kotlin
fun makeCoffee(strength: String) {
    println("Preparando un café $strength")
    println("Comprar granos de café")
    println("Moler los granos")
    println("Calentar agua a 90°C")
    println("Agregar agua caliente a los granos molidos")
    println("Listo, disfruta tu café $strength!")
}

fun main() {
    makeCoffee("fuerte")
    makeCoffee("suave")
}
```
</details>
<br>

## Control de Flujo: Personalizando el Café
Podemos usar control de flujo para determinar cuántas cucharadas de azúcar agregar al café. Intenta implementar esta lógica creando una función llamada `addSugar` antes de ver el ejemplo.

<details>
  <summary>Haz clic para ver el código</summary>

```Kotlin
fun addSugar(sugarCount: Int) {
    if (sugarCount == 1) {
        println("Café con una cucharada de azúcar")
    } else {
        println("Café con $sugarCount cucharadas de azúcar")
    }
}

fun main() {
    val sugarCount = 1  // Cambia este valor para probar diferentes cantidades
    addSugar(sugarCount)
}
```
</details>
<br>

Y si quisieras hacerlo con `when` para cubrir múltiples escenarios, como que te pasen una cantidad negativa de azúcar, que la cantidad sea 0, que solo sea una cucharada, o varias cucharadas. Intenta hacerlo por tu cuenta primero. 

<details>
  <summary>Haz clic para ver el código</summary>

```Kotlin
fun addSugarWith(sugarCount: Int) {
    when {
        sugarCount < 0 -> println("No se puede tener un número negativo de azúcar")
        sugarCount == 0 -> println("Café sin azúcar")
        sugarCount == 1 -> println("Café con una cucharada de azúcar")
        else -> println("Café con $sugarCount cucharadas de azúcar")
    }
}

fun main() {
    val sugarCount = 0  // Cambia este valor para probar diferentes cantidades
    addSugarWith(sugarCount)
}
```
</details>
<br>

## Funciones con Múltiples Parámetros
Podemos añadir más parámetros para personalizar aún más el café, por ejemplo, el nombre del destinatario. Intenta implementar esta funcionalidad antes de ver el código.

<details>
  <summary>Haz clic para ver el código</summary>

```Kotlin
fun makeCoffee(name: String, sugarCount: Int) {
    when {
        sugarCount < 0 -> println("No se puede tener un número negativo de azúcar para $name")
        sugarCount == 0 -> println("Café sin azúcar para $name")
        sugarCount == 1 -> println("Café con una cucharada de azúcar para $name")
        else -> println("Café con $sugarCount cucharadas de azúcar para $name")
    }
}

fun main() {
    makeCoffee("David", 1)
    makeCoffee("Cesar", 2)
    makeCoffee("Alfredo", 0)
}
```
</details>
<br>

## Interacción con el Usuario ☕️
Podemos hacer que nuestra aplicación sea más dinámica permitiendo al usuario ingresar el nombre del destinatario y la cantidad de azúcar. Intenta escribir el código para interactuar con el usuario.

<details>
  <summary>Haz clic para ver el código</summary>

```Kotlin
fun main() {
    println("¿Para quién es el café?")
    val name = readLine() ?: "Invitado"

    println("¿Cuántas cucharadas de azúcar deseas?")
    val sugarCountInput = readLine() ?: "0"
    val sugarCount = sugarCountInput.toIntOrNull() ?: 0

    makeCoffee(name, sugarCount)
}
```
</details>
<br>

También podemos hacer que el proceso sea repetitivo hasta que el usuario decida salir, preguntando al final si quiere hacer otra taza de café. Intenta implementar el bucle por tu cuenta.

<details>
  <summary>Haz clic para ver el código</summary>

```Kotlin
fun main() {
    var continueMakingCoffee = true

    while (continueMakingCoffee) {
        println("¿Para quién es el café?")
        val name = readLine() ?: "Desconocido"

        println("¿Cuántas cucharadas de azúcar deseas?")
        val sugarCountInput = readLine() ?: "0"
        val sugarCount = sugarCountInput.toIntOrNull() ?: 0

        makeCoffee(name, sugarCount)

        println("¿Deseas preparar otro café? (s/n)")
        val response = readLine()?.lowercase()
        if (response != "s") {
            continueMakingCoffee = false
        }
    }
}
```
</details>
