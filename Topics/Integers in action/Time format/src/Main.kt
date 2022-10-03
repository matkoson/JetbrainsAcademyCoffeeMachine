fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val secondsPastSinceMidnight = totalSeconds % (3600 * 24)

    val hours = secondsPastSinceMidnight / 3600
    val minutes = secondsPastSinceMidnight % 3600 / 60
    val seconds = secondsPastSinceMidnight % 3600 % 60


    print(hours)
    print(":")
    print(minutes)
    print(":")
    print(seconds)
}
