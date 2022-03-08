open public class Persona {

    public var nombre:String = ""
    public open var edad:Int = 10
    public var trabajo:Boolean
    public var energia:Int

    init {
        println("Hemos creado una persona")
        nombre = "Grace"
        edad = 30
        trabajo = true
        energia = 50
    }

    constructor(nombre:String, edad:Int, trabajo:Boolean){
        this.nombre = nombre
        this.edad = edad
        this.trabajo = trabajo
    }

    constructor(){

    }

    open fun comer(){
        println("Estoy comiendo")
        energia = energia + 50
    }

    fun beber(){
        println("Estoy bebiendo")
        energia = energia + 30
    }



}