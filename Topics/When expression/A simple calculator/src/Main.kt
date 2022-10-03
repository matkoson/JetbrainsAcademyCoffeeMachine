fun main() {
    val (first, operator, second) = readln().split(" ")

    println(
        when (operator) {
            "+" -> first.toLong() + second.toLong()
            "-" -> first.toLong() - second.toLong()
            "/" -> if (second.toLong() == 0.toLong()) "Division by 0!" else first.toLong() / second.toLong()
            "*" -> first.toLong() * second.toLong()
            else -> "Unknown operator"
        }
    )
}
