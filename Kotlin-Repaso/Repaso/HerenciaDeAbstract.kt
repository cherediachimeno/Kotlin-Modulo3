 open class HerenciaDeAbstract : Abstracta {

     constructor()

     public open fun restar() {
         println("estoy restando desde HerenciaDeAbstract")
     }

     override fun sumar(x: Int, y: Int): Int {
         TODO("Not yet implemented")
     }

 }