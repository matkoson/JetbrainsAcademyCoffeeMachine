fun main() {
    // the number of repetitions is equal to the respective number
    // input is a positive integer `n` - the number of the elements of the sequence that the program should print
    val expectedNumOfElements = readln().toInt()
    var elements = 0
    var printedNumber = 1

    while (elements != expectedNumOfElements) {
        repeat(printedNumber) {
            if (elements != expectedNumOfElements) {
                print(printedNumber)
                print(" ")
                elements += 1
            }
        }
        printedNumber += 1
    }
}
