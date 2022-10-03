fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()

    val range1 = a..b
    val range2 = c..d

    println(e in range1 || e in range2)
}
