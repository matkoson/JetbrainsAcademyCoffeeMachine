fun main() {
    var count = 0

    do {
        val input = readln().toInt()
        if (input != 0) {
            count += 1
        }
    } while (input != 0)

    println(count)
}
