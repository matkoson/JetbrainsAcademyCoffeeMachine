fun main() {
    val int1 = readln().toInt()
    val int2 = readln().toInt()
    val int3 = readln().toInt()
    var isPositive = 0

    fun getIsPositive(input: Int) {
        if (input > 0) {
            isPositive += 1
        }
    }

    getIsPositive(int1)
    getIsPositive(int2)
    getIsPositive(int3)

    println(isPositive == 1)
}
