fun main() {
    // put your code here
    val input = readln().toInt()

    val hundred = input / 100
    val ten = input % 100 / 10
    val one = input % 100 % 10

    print(one)
    print(ten)
    print(hundred)
}
