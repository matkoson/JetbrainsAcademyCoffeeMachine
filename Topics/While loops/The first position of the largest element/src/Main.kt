import java.util.*

fun main() {
    var position = 1
    var max: Int? = null
    var maxPosition: Int? = null
    val scanner = Scanner(System.`in`)

    do {
        val input = scanner.nextInt()
        if (max == null || input > max) {
            max = input
            maxPosition = position
        }
        position += 1

    } while (scanner.hasNext())
    print(max)
    print(" ")
    print(maxPosition)
}
