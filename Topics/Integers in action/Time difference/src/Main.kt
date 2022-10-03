const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    // two moments
    // the second moment happened *NOT EARLIER* than the first one
    // how many SECONDS passed between the two moments

    // first moment
    val hours = readln().toInt()
    val minutes = readln().toInt()
    val seconds = readln().toInt()

    // second moment
    val hours2 = readln().toInt()
    val minutes2 = readln().toInt()
    val seconds2 = readln().toInt()

    val totalSeconds = hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds
    val totalSeconds2 = hours2 * SECONDS_IN_HOUR + minutes2 * SECONDS_IN_MINUTE + seconds2

    println(totalSeconds2 - totalSeconds)
}
