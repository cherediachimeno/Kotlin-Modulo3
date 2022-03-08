fun main(args: Array<String>) {

    /**
     * You can edit, run, and share this code.
     * play.kotlinlang.org
     */
    fun main(args: Array<String>) {

        var numero = 1
        var calculo:Int = 10

        var numero2 = 3.5

        //var calculo = 20;
        var suma:Int = calculo + numero


        println("Hello, world!!, la suma es de " + suma)

        var resta = numero2 - numero
        println(resta)

        var operacion = numero + calculo + numero2
        println(operacion)

        //Podemos sumar sin poner into, double, etc... pero hay que tener en cuenta que tipo de variables es cada uno

        var nombre = "Toni"
        var prueba =  nombre + numero;
        println(prueba)
        //Los suma como si todo fuera un string

        var numero11:Float = 1.1f
        var numero12:Double = 20.20
        var prueba2 = numero11 + numero12
        println(prueba2)

        var calculando = numero11.toInt()
        println(calculando)

        var x:Char = 'a'
        var y = 'c'

        var nombreEstudiante = "Paco"
        var apellido = "Rodriguez"

        var caracteres = apellido.length

        println(apellido.get(2))
        println("Hola, buenos dias Paco $apellido")


        var listaEstudiantes = arrayOf("Paco" , "Miguel", "Pol", "Jordi")

        println(listaEstudiantes[1])
        println(nombre)
        println(nombreEstudiante)

        // Comentarios en linea
        /* Comentarios en bloque

         */


        var edad:Int = 30
        var votar:Boolean = false

        if(edad>18){
            votar = true
            println("Puedes votar")
        } else {
            votar = false
            println("NO puedes votar")

        }


        var n:Int = 4

        when (n) {
            1 -> {
                println("Es el numero 1")
            }
            2 -> {
                println("Es el numero 2")
            }
            3 -> {
                println("Es el numero 3")
            }
            4 -> {
                println("Es el numero 4")
            }
        }
        //Podemos hacer lo mismo mas facil, incluso con un if
        when(n){
            1 -> println("Es el numero 1")
            2 -> println("Es el numero 2")
            3 -> println("Es el numero 3")
            4 -> println("Es el numero 4")
            else -> print("No es ningun numero de lo otros")

        }

        // otros estilos
        //

        var nota = 8

        when(nota){
            in 0..4-> println("Suspendido")
            in 5 ..6 -> println("aprobado")
            in 7..8 -> println("notable")
            in 9..9 -> println("excelente")
            else -> print("No es ningun numero de lo otros")

        }

        var notas = 10
        when(notas){
            in 0..4-> println("Suspendido")
            in 5 ..6 -> println("aprobado")
            in 7..8 -> println("notable")
            in 9..9 -> println("excelente")

        }

        // Hacemos bucles ahora:



        val items = listOf("Jose", "Maria", "Mieguel", "Angela")
        println(items)

        for (positions in items.indices){
            println("$(items[positions]) esta en la posicion $positions")
        }


        fun saludar() {
            println("buenos días")
            var saludo:String = "Nuenos días por la mañana"
        }

        fun despedirse(): String {
            println("adiós")
            var adios:String = "Adiós por la noche"
            return adios
        }

        fun edad(): Int{
            return 35
            var edadReal: Int=edad()
        }

        saludar()
        println(despedirse())
        print(edad)

        fun suma(x:Int, y:Int): Int{
            return x+y
            var calculo = suma(3,3)

        }


        println(suma(2,2))

        println(calculo)

        //(fun ejercicio (dia: Int, mes: Int, nombre:String, trabajas:Boolean): Unit{
        //     println("Buenos días, hoy es $dia, del mes $mes. ¿Cómo estas $nombre? ¿$trabajas?")

        //  ejercicio(dia:1, mes:3, nombre:"Pol", trabajas:false)
        //  println(ejercicio)







    }
