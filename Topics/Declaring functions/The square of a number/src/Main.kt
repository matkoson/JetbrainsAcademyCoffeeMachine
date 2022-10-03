import kotlin.math.pow

// write your code here
fun square(first: Int): Int = first.toDouble().pow(2.0).toInt()

/* Do not change code below */
fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}
