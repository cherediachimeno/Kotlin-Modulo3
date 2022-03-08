open class Visibilidad {

    // OPEN - No es un modificador de visibilidad. Simplemente permite tratarlo
    // con posterioridad
    open var y:Int = 10

    // Modificadores de visibilidad

    // PUBLIC - Permite acceder al elemento desde cualquier parte
    public var x:Int = 9

    //INTERNAL - Solo se puede acceder desde el módulo del código (misma carpeta)
    internal var a:Int = 8

    //PROTECTED - Solo se puede acceder desde la clase que lo define y desde las clases
    // derivadas
    protected val pi: Double = 3.14

    //PRIVATE - Solo se puede acceder desde la clase que lo ha definido.
    private var Acceso:String = "Ordenador"
}