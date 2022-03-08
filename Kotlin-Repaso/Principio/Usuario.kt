class Usuario : Persona {

    override var edad = 50

    init {
        println("Hemos creado un usuario")
    }

    constructor(nombre: String, edad:Int){
        this.nombre = nombre
        this.edad = edad
    }

    override fun comer(){
        println("Estoy comiendo desde usuario")
    }

}


