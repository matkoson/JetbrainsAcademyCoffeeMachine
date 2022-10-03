// write your function here
fun isVowel(char: Char): Boolean {
    val vowels = listOf('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
    return vowels.contains(char)
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
