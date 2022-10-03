// write your code here
fun divide(first: Long, second: Long): Double {
    return first.toDouble() / second.toDouble()
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}
