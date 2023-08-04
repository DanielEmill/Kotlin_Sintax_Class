
class SmartDevice {
    fun turnOn(){
        println("El dispositivo se ha encendido.")
    }

    fun turnOff(){
        println("El dispositivo se ha apagado.")
    }
}

fun main(args: Array<String>) {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn();
}