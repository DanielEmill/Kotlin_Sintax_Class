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

fun main(args: Array<String>) {
    val smartTvDevice = SmartDevice("Android TV", "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
}