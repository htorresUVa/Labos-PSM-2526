# Colecciones para Manejar Datos Dinámicos en el Mundo Real 🏠

## Tabla de contenidos 📚
- [Colecciones para Manejar Datos Dinámicos en el Mundo Real 🏠](#colecciones-para-manejar-datos-dinámicos-en-el-mundo-real-)
- [Introducción a las Colecciones en Kotlin 🔧✨](#introducción-a-las-colecciones-en-kotlin-)
- [Listas](#listas)
- [Conjuntos: Una Colección Sin Duplicados 🧑‍🥥🧑‍🥥](#conjuntos-una-colección-sin-duplicados-)
- [Mapas en Kotlin: Colecciones Clave-Valor 💻🔧](#mapas-en-kotlin-colecciones-clave-valor-)
- [Colecciones Especializadas en Kotlin: Características y Usos 🔧🌐](#colecciones-especializadas-en-kotlin-características-y-usos-)


# Introducción a las Colecciones en Kotlin 🔧✨

En Kotlin, una **colección** es una estructura de datos que nos permite **almacenar y manipular grupos de elementos** de manera eficiente. Estas colecciones pueden ser **mutables** o **inmutables**, dependiendo de si queremos permitir modificaciones después de su creación.

Exploraremos los diferentes tipos de colecciones en Kotlin y cómo se pueden utilizar para resolver diversos problemas. Veremos las colecciones principales: **listas**, **conjuntos** y **mapas**; además de algunas **colecciones especializadas**.

## 💾 Tipos de Colecciones en Kotlin
Las colecciones en Kotlin se dividen en varias categorías, cada una con sus propias características y usos. Las colecciones principales incluyen:
- **Listas (List)**: Almacenan elementos ordenados y pueden contener duplicados. Son útiles cuando se necesita un acceso secuencial o por índice a los elementos.
- **Conjuntos (Set)**: Almacenan elementos únicos, sin duplicados. Ideales para garantizar la unicidad de los elementos.
- **Mapas (Map)**: Almacenan pares clave-valor, permitiendo asociar información y acceder rápidamente a valores mediante claves.

Además, en Kotlin encontramos versiones **mutables** e **inmutables** de cada tipo de colección:
- **Colecciones Inmutables**: No pueden ser modificadas después de su creación, lo cual aumenta la seguridad y la consistencia de los datos.
- **Colecciones Mutables**: Permiten agregar, modificar o eliminar elementos después de la creación, siendo útiles cuando se requiere flexibilidad.

## 🛋️ Diferencia entre `val`/`var` y Colecciones Mutables/Inmutables ⚠️

Es importante aclarar que la diferencia entre **colecciones mutables e inmutables** no es lo mismo que declarar una variable como **`val`** o **`var`**. Aunque ambas características están relacionadas con la mutabilidad, se refieren a conceptos distintos en Kotlin.

### `val` y `var`
- **`val`**: Una variable declarada con `val` es **inmutable**, lo que significa que la **referencia** a la colección no puede ser reasignada. Sin embargo, si la colección es mutable, los elementos dentro de la colección pueden ser modificados.
- **`var`**: Una variable declarada con `var` es **mutable**, lo que significa que se puede **reasignar** la referencia de la colección, permitiendo cambiar la colección por completo.

### Colecciones Mutables e Inmutables
- **Colecciones Inmutables**: No permiten agregar, eliminar o modificar sus elementos una vez creadas. Son ideales cuando se necesita asegurar la **consistencia** de los datos y evitar modificaciones accidentales.
- **Colecciones Mutables**: Permiten agregar, eliminar o modificar elementos en cualquier momento. Son útiles cuando necesitamos flexibilidad y los elementos de la colección van a cambiar a lo largo del tiempo.

### Ejemplo para Aclarar la Diferencia
Supongamos que tenemos una lista de nombres de estudiantes:

```kotlin
val listaMutable = mutableListOf("Héctor", "Pablo")
listaMutable.add("Diego")  // Esto está permitido, ya que la lista es mutable

val listaInmutable = listOf("Matías", "Diego")
// listaInmutable.add("Pablo")  // Esto no está permitido, ya que la lista es inmutable

var listaReasignable = listOf("César")
listaReasignable = listOf("Alfredo", "Dimitar")  // Esto está permitido, ya que `var` permite reasignación
```

# Listas
Vamos a aprender cómo usar **listas en Kotlin** para gestionar datos de manera dinámica y flexible. Imaginemos que Pablo, un desarrollador de Android, está en una tienda comprando componentes para construir su PC de ensueño. A medida que Pablo va encontrando nuevos componentes, puede agregarlos o reemplazarlos en su lista de compras. Este ejemplo ilustra perfectamente la utilidad y flexibilidad de las listas en Kotlin. Vamos a recrear la aventura de Pablo en Kotlin, modelando su lista de compras.

## 🛋️ Creando una Lista Inmutable
Primero, vamos a ver cómo crear una lista básica en Kotlin. Las listas **inmutables** no se pueden modificar después de su creación, lo cual puede ser útil si no queremos que la información cambie:

``` kotlin
val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

println(shoppingList)
```

- **`listOf`** crea una lista inmutable.
- Al ser **inmutable**, no podemos añadir, quitar o modificar elementos de la lista después de su creación.

## 🔥 Listas Mutables: Añadiendo y Modificando Elementos
Para resolver esta limitación, podemos usar una **lista mutable** que nos permita añadir o eliminar elementos según sea necesario:

``` kotlin
val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")

// Añadir un nuevo componente
shoppingList.add("Cooling System")

// Reemplazar la tarjeta gráfica con una mejor
shoppingList.remove("Graphics Card")
shoppingList.add("RTX 4090")

println(shoppingList)
```

## 🤖 Métodos de las Listas
En Kotlin, los métodos para manipular listas (como `add()`, `remove()`, etc.) son conocidos como **métodos de instancia** o **métodos de objeto**. Esto se debe a que, en Kotlin, todo es un **objeto**, y los métodos son funciones que pertenecen a esos objetos.

[👀 Revisa la documentación de las listas.](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/)

## Trabajando con Índices en Listas 📋

### Introducción
Nos vamos a enfocar en los **índices** dentro de las listas, que nos permiten acceder y manipular elementos específicos de manera más precisa. Vamos a aprender cómo funcionan los índices en Kotlin y cómo se pueden utilizar para manipular nuestra lista de compras de componentes de PC.

### 🔢 ¿Qué es un Índice?
En programación, un **índice** representa la posición de un elemento dentro de una lista o un array. En Kotlin, al igual que en la mayoría de los lenguajes de programación, los índices comienzan desde **cero**. Esto significa que el primer elemento de una lista está en la posición 0, el segundo en la posición 1, y así sucesivamente.

### 🔍 Accediendo a Elementos por Índice
Podemos acceder a un elemento específico de la lista utilizando su índice. Por ejemplo, si queremos obtener el segundo elemento (`RAM`), podemos hacerlo de la siguiente manera:

```kotlin
val item = shoppingList[1]
println(item)  // Salida: RAM
```

# Conjuntos: Una Colección Sin Duplicados 🧑‍🥥🧑‍🥥

Ahora vamos a explorar cómo utilizar **conjuntos en Kotlin**. A diferencia de las listas, los conjuntos no permiten elementos duplicados, lo que los hace ideales cuando necesitamos garantizar que cada elemento sea único. Vamos a ver cómo funcionan los conjuntos inmutables y mutables en Kotlin, ilustrándolo con ejemplos.

## 🎯 Creando un Conjunto Inmutable
Un **conjunto inmutable** es una colección cuyos elementos no se pueden modificar una vez que ha sido creada. Imagina que Héctor está organizando una conferencia y necesita mantener una lista única de asistentes sin permitir duplicados.

```kotlin
val attendees = setOf("Héctor", "Pablo", "Matías", "Diego")

println(attendees)
```

[👀 Revisa la documentación de los conjuntos inmutables.](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/)

## Conjuntos Mutables: Añadiendo y Eliminando Elementos 🚀

Si necesitamos un conjunto que permita la **modificación** de sus elementos, podemos usar un **conjunto mutable** (`MutableSet`). Sigamos con el ejemplo anterior, pero ahora permitamos que Héctor pueda agregar y quitar asistentes de la lista de manera dinámica.

```kotlin
val mutableAttendees = mutableSetOf("Héctor", "Pablo", "Matías")

// Añadir un nuevo asistente
mutableAttendees.add("Daniel")

// Intentar añadir un asistente que ya está en el conjunto
mutableAttendees.add("Pablo")  // Esto no añadirá un duplicado

// Eliminar un asistente
mutableAttendees.remove("Matías")

println(mutableAttendees)
```

[👀 Revisa la documentación de los conjuntos mutables.](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/)

# Mapas en Kotlin: Colecciones Clave-Valor 💻🔧

En Kotlin, los **mapas** (también conocidos como **diccionarios**) son una colección de pares **clave-valor**. Son útiles cuando necesitamos almacenar relaciones entre objetos, como asociar los nombres de alumnos con sus notas o roles. Vamos a explorar cómo funcionan los mapas inmutables y mutables en Kotlin, y cómo aprovecharlos para resolver problemas prácticos.

## 🚪 Creando un Mapa Inmutable
Primero, vamos a crear un **mapa inmutable**. Supongamos que Diego quiere asociar a cada alumno con el rol que tendrá durante una actividad en clase.

```kotlin
val roles = mapOf(
    "Héctor" to "Líder",
    "Pablo" to "Secretario",
    "Matías" to "Gestor",
    "Diego" to "Moderador"
)

println(roles)
```

[👀 Revisa la documentación de los mapas inmutables.](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/)

## Mapas Mutables: Modificando Claves y Valores 🚀

Si necesitamos un mapa que permita **modificar** los pares clave-valor, podemos usar un **mapa mutable** (`MutableMap`). Ahora imaginemos que Diego decide actualizar algunos roles durante la actividad.

```kotlin
val mutableRoles = mutableMapOf(
    "Héctor" to "Líder",
    "Pablo" to "Secretario",
    "Matías" to "Gestor"
)

// Añadir un nuevo rol
mutableRoles["Daniel"] = "Observador"

// Cambiar el rol de Matías
mutableRoles["Matías"] = "Ayudante"

// Eliminar un rol
mutableRoles.remove("Pablo")

println(mutableRoles)
```

[👀 Revisa la documentación de los mapas mutables.](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/)

# Colecciones Especializadas en Kotlin: Características y Usos 🔧🌐

## 🛋️ ArrayList
**ArrayList** es una implementación de una lista mutable que utiliza un array dinámico como estructura subyacente.

- **Usos**: Es muy útil cuando necesitamos acceder a los elementos mediante índices o cuando se requiere una colección que cambie frecuentemente de tamaño.

```kotlin
val students = arrayListOf("Héctor", "Pablo", "Matías")
students.add("Diego")  // Añadir un nuevo alumno
students.removeAt(1)    // Eliminar a "Pablo" según su índice
println(students)       // Salida: [Héctor, Matías, Diego]
```

[👀 Revisa la documentación de los ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/)

## 📍 HashSet
**HashSet** es una implementación de un conjunto sin elementos duplicados, utilizando una **tabla hash** como estructura interna.

```kotlin
val uniqueNames = hashSetOf("Héctor", "Pablo", "Matías")
uniqueNames.add("Diego")
uniqueNames.add("Héctor")  // No se añade porque ya está presente
println(uniqueNames)          // Salida: [Héctor, Pablo, Matías, Diego]
```

[👀 Revisa la documentación de los HashSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-set/)

## 📌 LinkedHashSet
**LinkedHashSet** es una variante de `HashSet` que mantiene el **orden de inserción** de los elementos.

```kotlin
val orderedNames = linkedSetOf("Matías", "Pablo", "Diego")
orderedNames.add("Alfredo")
println(orderedNames)  // Salida: [Matías, Pablo, Diego, Alfredo]
```

[👀 Revisa la documentación de los LinkedHashSet](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-linked-hash-set/)

---

## 🎓 Resumen
Estas colecciones especializadas en Kotlin nos permiten elegir la estructura adecuada según nuestras necesidades específicas:
- **ArrayList** para listas ordenadas y con acceso por índice.
- **HashSet** para conjuntos únicos sin preocuparse del orden.
- **LinkedHashSet** para conjuntos únicos con un orden de inserción.

Elegir la colección adecuada nos ayuda a escribir un código más eficiente y fácil de mantener. ¡Prueba cada una para ver cuál se adapta mejor a tus necesidades!