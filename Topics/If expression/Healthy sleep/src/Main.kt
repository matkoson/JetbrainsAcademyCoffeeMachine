fun main() {
    // A - min hours of sleep
    // B - max hours of sleep
    // H - num of hours actually slept
    // if H is in A-B range, print "Normal"
    // if H < A, print "Deficiency"
    // if H > B, print "Excess"

    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    // A is always less than or equal to B

    println(
        if (h < a) {
            "Deficiency"
        } else if (h > b) {
            "Excess"
        } else {
            "Normal"
        }
    )
}
