import kotlin.math.pow

fun main() {
    // print all squares of natural numbers that do not exceed 'square' in ascending order
    val square = readln().toInt()
    var count = 1
    var result = 1

    do {
        println(result)
        count += 1
        result = count.toDouble().pow(2.0).toInt()
    } while (result <= square)
}
