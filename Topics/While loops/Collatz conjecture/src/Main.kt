fun main() {
    val input = readln().toInt()
    var result = input

    print("$result ")
    while (result != 1) {
        if (result % 2 == 0) {
            result /= 2
            print("$result ")

        } else {
            result = result * 3 + 1
            print("$result ")

        }
    }
}
