fun main() {
    val input = readLine()!!


    // otherwise, print the unchanged string

    if (input.isEmpty()) {
        return println(input)
    }
    println(
        when (input.first()) {
            // if the string's first symbol is `i`, remove the first symbol
            // the string will contain a number
            // add 1 to the number and print it
            'i' -> input.drop(1).toInt() + 1
            // if the string's first symbol is `s`, remove the first symbol
            // print the reversed remainder
            's' -> input.drop(1).reversed()
            else -> input
        }
    )

}
