import java.lang.Math.hypot


fun perimeter(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    x4: Double = 0.0,
    y4: Double = 0.0
): Double {
    val length1 = hypot((x2 - x1), (y2 - y1))
    val length2 = hypot((x3 - x2), (y3 - y2))
    return if (x4 == 0.0 && y4 == 0.0) {
        val length3 = hypot((x1 - x3), (y1 - y3))
        length1 + length2 + length3
    } else {
        val length3 = hypot((x4 - x3), (y4 - y3))
        val length4 = hypot((x1 - x4), (y1 - y4))
        length1 + length2 + length3 + length4
    }
}
