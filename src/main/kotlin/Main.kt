class SmartDevice(val name: String, val category: String) {
    var deviceStatus = "online"
    constructor(name: String, category: String, statusCode: Int) : this(name, category)
    {
        deviceStatus = when (statusCode)
        {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}
class Persona{
    var ID:String = ""
    var nombre:String=""
    var edad:Int=0
    var telefono:String=""
    fun Caminar(){
        println("La persona empezo a caminar.")
    }
    fun ImprimirDatos(){
        println("Nombre: $nombre \n ID: $ID \n Edad: $edad \n Telefono: $telefono")
    }
}

fun main(args: Array<String>) {
    val smartTvDevice = SmartDevice("Android TV", "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
}