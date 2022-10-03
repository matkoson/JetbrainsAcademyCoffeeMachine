enum class Rainbow(val colorName: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet"),
    NULL("")
}

fun main() {
    val color = readln()
    for (rainbowColor in Rainbow.values()) {
        if (color == rainbowColor.colorName) return println(true)
    }
    println(false)
}
