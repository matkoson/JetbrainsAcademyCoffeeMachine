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
    println(Rainbow.valueOf(color.uppercase()).ordinal + 1)
}
