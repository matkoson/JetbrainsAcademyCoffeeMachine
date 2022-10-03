fun main() {
    val programmingLanguage = readln().toInt()

    println(
        when (programmingLanguage) {
            1 -> "No!"
            2 -> "Yes!"
            3 -> "No!"
            4 -> "No!"
            else -> "Unknown number"
        }
    )
}
