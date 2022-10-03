import kotlin.math.pow

fun calculateFinalAmount(amount: Int = 1000, years: Int = 10, percent: Int = 5): Int {
    return (amount * ((1 + percent / 100.0).pow(years))).toInt()
}

fun main() {
    val customParameterName = readln()
    val customParameterValue = readln().toInt()

    when (customParameterName) {
        "amount" -> println(calculateFinalAmount(customParameterValue))
        "years" -> println(calculateFinalAmount(years = customParameterValue))
        "percent" -> println(calculateFinalAmount(percent = customParameterValue))
        else -> println("Invalid parameter name")
    }
}
