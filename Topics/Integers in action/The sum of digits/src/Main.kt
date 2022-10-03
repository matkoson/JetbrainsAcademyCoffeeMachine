fun main() {
    val inputNumber = readln().toInt()

    val firstDigit = inputNumber / 100
    val secondDigit = (inputNumber - firstDigit * 100) / 10
    val thirdDigit = inputNumber % 10

    println(firstDigit + secondDigit + thirdDigit)
}
