fun main() {
    var positiveNumbersCount = 0
    repeat(readln().toInt()) {
        val input = readln().toInt()
        if (input > 0) {
            positiveNumbersCount += 1
        }
    }
    println(positiveNumbersCount)
}
