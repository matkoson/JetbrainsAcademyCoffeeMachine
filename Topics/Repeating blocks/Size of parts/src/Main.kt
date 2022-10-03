fun main() {
    // if larger, it can be fixed - "1"
    // if smaller, it's rejected - "-1"
    // if perfect, sent to a box - "0"
    val numOfParts = readln().toInt()
    var numOfPerfect = 0
    var numOfLarger = 0
    var numOfRejections = 0

    repeat(numOfParts) {
        val partAssessment = readln().toInt()
        when (partAssessment) {
            -1 -> numOfRejections += 1
            0 -> numOfPerfect += 1
            1 -> numOfLarger += 1
        }
    }

    print(numOfPerfect)
    print(" ")
    print(numOfLarger)
    print(" ")
    print(numOfRejections)
}
