fun main(args: Array<String>) {
    println("Hello Colecciones!")

    //SET - INMUTABLE

    // AUNQUE TENGAMOS 9, SOLO CONTABILIZA LOS NO REPETIDOS.
    val elementos:Set<Int> = setOf(1,2,3,4,5,6,7,8,9, 1, 2, 3)

    println(elementos.size)

    // SET - MUTABLE

    var elementos2:Set<Int> = mutableSetOf(1,2,3,4,5,6,7,8,9)
    println(elementos2.contains(11))
    println(elementos2.toString())
    println(elementos2.minus(1))

    println(elementos2.plus(200))
    println(elementos2.toString())


    /*


    // MAP INMUTABLE
    val frutas:Map<String, Int> = mapOf("Manzana" to 20, "Pera" to 10, "Sandia" to 2)

    println(frutas["Manzana"])

    // MAP MUTABLE

    val frutasMutable:MutableMap<String, Int> = mutableMapOf("Manzana" to 20, "Pera" to 10, "Sandia" to 2)

    frutasMutable.put("Mango", 3)
    frutasMutable.put("Kiwi", 20)
    println(frutasMutable.size)
    println(frutasMutable.toString())
    frutasMutable.remove("Manzana")
    println(frutasMutable.toString())

    // Actualizando datos, dos formas diferentes. Id probando e investigando
    frutasMutable["Kiwi"] = 0

    println(frutasMutable.toString())

    frutasMutable.putAll(setOf("Mango" to 3, "Mango" to 1))

    println(frutasMutable.toString())

    /*
    //LISTA INMUTABLE. NO PODEMOS CAMBIAR NI SU TAMAÑO NI SU TIPO NI LOS ELEMENTOS
    val lista:List<String> = listOf("Avión", "Coche", "Camión")

    println(lista.size)
    println(lista.first())
    println(lista.last())
    println(lista.get(1))

    //LISTA MUTABLE - Permite aceptar más elementos y modificarlos.

    val listaMutable:MutableList<String?> = mutableListOf("Avión", "Coche", "Camión")
    // Si ponemos String? en vez de String permite aceptar null
    println(listaMutable.size)
    println(listaMutable.first())
    println(listaMutable.last())
    println(listaMutable.get(1))

    listaMutable.add("tren")
    println(listaMutable.size)

    println("Antes " + listaMutable[1])
    listaMutable[1] = "Taxi"
    println("Después " + listaMutable[1])
    listaMutable.add(null)
    println("ELEMENTOS LISTA NULL Y STRING TOTALES: " + listaMutable.size)

    // Podemos crear una lista mutable nueva que filtre los elementos que no sean NULL

    var listaMutableSinNull:List<String> = listaMutable.filterNotNull()
    println("ELEMENTOS NO NULL: " + listaMutableSinNull.size)

   // Otra forma de filtrar null, utilizando función directamente sin guardar nueva
    //array

    println(listaMutable.filterNotNull().size)

*/


















    // ARRAYS "NORMALES" - LIMITADOS POR TIPO Y TAMAÑO
    /*
    val numeros: Array<Int> = arrayOf(2,4,6,9)
    println(numeros[2])

    var calculos:Array<String>
    val numeros2 = arrayOfNulls<String>(4)

    numeros2[1] = "Maria"
    numeros2[2] = null
    numeros2[1] = "Paco"

    val personas = Array<Persona>(5) {index ->
        when(index){
            0 -> Persona("Mucha", 17)
            1 -> Persona("Poca", 29)
            2 -> Persona("Mucha", 5)
            3 -> Persona("Poca", 55)
            4 -> Persona("Mucha", 2)
            5 -> Persona("Poca", 26)
            6 -> Persona("Bastante", 24)
            else -> throw IllegalArgumentException("Excepción detectada")
        }
    }

    println(personas.joinToString(" "))
    println(personas.contentToString())
    personas.forEach { println(it) }
*/
*/
}

