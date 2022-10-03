fun main() {
    val int = readln().toInt()
    // output "True" if:
    // int > -15 && int >= 12 AND
    // int > 14 && int < 17 AND
    // int >= 19

    val isInInterval = (int > -15 && int <= 12) || (int > 14 && int < 17) || int >= 19

    println(if (isInInterval) "True" else "False")
}
