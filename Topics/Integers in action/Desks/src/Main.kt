fun main() {
    // put your code here
    // three new math groups
    // each group in a separate classroom
    // *exactly* two people at every desk
    // I know how many students in each group
    // get the smallest number of desks that the school needs to buy
    val group1 = readln().toInt()
    val group2 = readln().toInt()
    val group3 = readln().toInt()
    val numberOfStudentsAtEachDesk = 2

    fun getMinNumberOfDesksForGroup(students: Int): Int {
        val isEven = students % numberOfStudentsAtEachDesk == 0
        val numberOfDesks = students / 2
        return if (isEven) {
            numberOfDesks
        } else {
            numberOfDesks + 1
        }
    }

    val desksForGroup1 = getMinNumberOfDesksForGroup(group1)
    val desksForGroup2 = getMinNumberOfDesksForGroup(group2)
    val desksForGroup3 = getMinNumberOfDesksForGroup(group3)

    println(desksForGroup1 + desksForGroup2 + desksForGroup3)
}
