fun main() {
    // leap year is either:
    // divisible by 4, but NOT divisible by 100
    // or:
    // divisible by 400

    val year = readln().toInt()
    val isLeapYear = year % 4 == 0 && year % 100 != 0 && year % 100 != 0 || year % 400 == 0

    println(if (isLeapYear) "Leap" else "Regular")
}
