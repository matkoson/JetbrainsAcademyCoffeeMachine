fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()
    val firstRange = a..b
    val secondRange = c..d

    println(e in firstRange && e in secondRange)
}
