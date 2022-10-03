fun main() {
    val numOfGrades = readln().toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(numOfGrades) {
        val grade = readln().toInt()
        when (grade) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }

    print(d)
    print(" ")
    print(c)
    print(" ")
    print(b)
    print(" ")
    print(a)
}
