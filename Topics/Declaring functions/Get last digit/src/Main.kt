// write your code here
fun getLastDigit(num: Int): Char {
    val str = num.toString()
    return str[str.length - 1]
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
