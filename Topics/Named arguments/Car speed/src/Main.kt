fun main() {
    val carSpeed = readln().toInt()
    val carSpeedLimit = readln().toIntOrNull() ?: 60
    return if (carSpeed > carSpeedLimit) {
        println("Exceeds the limit by ${carSpeed - carSpeedLimit} kilometers per hour")
    } else {
        println("Within the limit")
    }
}
