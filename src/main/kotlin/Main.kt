
class SmartDevice {
    //Propiedades
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

//gets y sets
    var speakerVolume = 2
        get() = field
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    //Constructor

    class SmartDevice(val name: String, val category: String) {

        var deviceStatus = "online"

        fun turnOn(){
            println("El dispositivo se ha encendido.")
        }

        fun turnOff(){
            println("El dispositivo se ha apagado.")
        }
    }
//metodos
    fun turnOn(){
        println("El dispositivo se ha encendido.")
    }
    fun turnOff(){
        println("El dispositivo se ha apagado.")
    }

}

fun main(args: Array<String>) {
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
}