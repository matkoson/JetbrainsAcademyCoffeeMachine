// write your function here
fun sum(first: Int, second: Int, third: Int): Int = first + second + third

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}
