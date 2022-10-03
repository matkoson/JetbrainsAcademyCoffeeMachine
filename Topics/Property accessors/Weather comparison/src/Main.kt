const val MIN_ACCEPTABLE_TEMP = -92
const val MAX_ACCEPTABLE_TEMP = 57

data class City(val name: String, val avgTemperature: Int) {
    var degrees: Int = 0
        set(value) {
            field = if (value < MIN_ACCEPTABLE_TEMP || value > MAX_ACCEPTABLE_TEMP) {
                avgTemperature
            } else {
                value
            }
        }
}

fun main() {
    val dubaiInput = readLine()!!.toInt()
    val moscowInput = readLine()!!.toInt()
    val hanoiInput = readLine()!!.toInt()
    val dubaiTemp = City("Dubai", 30)
    dubaiTemp.degrees = dubaiInput
    val moscowTemp = City("Moscow", 5)
    moscowTemp.degrees = moscowInput
    val hanoiTemp = City("Hanoi", 20)
    hanoiTemp.degrees = hanoiInput

    val minTemperature = listOf(dubaiTemp, moscowTemp, hanoiTemp).minOfOrNull { it.degrees } ?: 0
    val hasMinTemperature = listOf(dubaiTemp, moscowTemp, hanoiTemp).filter { it.degrees == minTemperature }

    print(
        if (hasMinTemperature.isNotEmpty() && hasMinTemperature.size > 1) {
            "neither"
        } else {
            hasMinTemperature[0].name
        }
    )
}
