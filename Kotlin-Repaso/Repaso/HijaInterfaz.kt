class HijaInterfaz: Interface, HerenciaDeAbstract {

    constructor()

    override var resultado: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override var operacion: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun area() {
        TODO("Not yet implemented")
    }

    override fun perimetro() {
        TODO("Not yet implemented")
    }

    override fun restar(){
        println("estoy restando desde HijaInterfaz")
    }
}


