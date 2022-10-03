fun main() {
    val input1 = readln().toInt()
    val input2 = readln().toBoolean()

    // party should have input1 between 10 and 20(inclusive), when input2 == false
    // party should have input2 between 15 and 25(inclusive), when input1 == true

    if (input2) {
        println(input1 >= 15 && input1 <= 25)
    } else {
        println(input1 >= 10 && input1 <= 20)
    }
}
