fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    // if sum of any of the 2 sides lengths exceeds the 3rd side it's a triangle

    val sum1 = a + b
    val sum2 = a + c
    val sum3 = b + c

    val isTriangle = sum1 > c && sum2 > b && sum3 > a

    println(if (isTriangle) "YES" else "NO")
}
