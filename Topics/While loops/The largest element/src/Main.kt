fun main() {
    var max = 0

    do {
        val input = readln().toInt()
        if (input > max) max = input

    } while (input != 0)

    println(max)
}
