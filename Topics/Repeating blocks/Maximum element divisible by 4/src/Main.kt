fun main() {
    val elements = readln().toInt()
    var maxNumDivisibleBy4 = 0

    repeat(elements) {
        val element = readln().toInt()
        if (element % 4 == 0 && element > maxNumDivisibleBy4) {
            maxNumDivisibleBy4 = element
        }
    }
    println(maxNumDivisibleBy4)
}
