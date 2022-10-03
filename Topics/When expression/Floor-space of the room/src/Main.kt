import java.math.RoundingMode
import kotlin.math.pow

fun main() {
    // rooms can be: triangular, rectangular, and circle-type

    val roomShape = readln()

    //    fun formatToDecimal(value: Double): String = String.format("%.1f", value)
    fun formatToDecimal(value: Double, scale: Int): String =
        value.toBigDecimal().setScale(scale, RoundingMode.FLOOR).toString()
    println(
        when (roomShape) {
            "triangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()
                val c = readln().toDouble()
                kotlin.math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))
            }

            "rectangle" -> {
                val a = readln().toDouble()
                val b = readln().toDouble()

                formatToDecimal(
                    a * b,
                    1,
                )
            }

            "circle" -> {
                val r = readln().toDouble()
                3.14 * r.pow(2.toDouble())
            }

            else -> "Unknown shape!"
        }
    )
}
