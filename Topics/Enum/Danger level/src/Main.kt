enum class DangerLevel(val levelNumber: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {
        return DangerLevel.valueOf(this.name).levelNumber
    }
}

fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel())
}




