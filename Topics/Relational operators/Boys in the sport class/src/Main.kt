fun main() {
    // check if the three input values are sorted in desc OR asc order
    // if all three values are equal, return true

    val int1 = readln().toInt()
    val int2 = readln().toInt()
    val int3 = readln().toInt()

    val isDesc = int1 >= int2 && int2 >= int3
    val isAsc = int1 <= int2 && int2 <= int3
    val isEqual = int1 == int2 && int2 == int3

    println(isEqual || isDesc || isAsc)
}
