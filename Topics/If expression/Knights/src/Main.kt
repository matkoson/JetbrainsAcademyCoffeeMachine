import java.lang.Math.abs

fun main() {
    val (x1Raw, y1Raw) = readln().split(' ')
    val (x2Raw, y2Raw) = readln().split(' ')
    val x1 = x1Raw.toInt()
    val y1 = y1Raw.toInt()
    val x2 = x2Raw.toInt()
    val y2 = y2Raw.toInt()

    // top right high (x, y)
    val hit1 = listOf(1, 2)
    // top right low (x, y)
    val hit2 = listOf(2, 1)

    // bottom right high (x, y)
    val hit3 = listOf(2, -1)
    // bottom right low (x, y)
    val hit4 = listOf(1, -1)

    // bottom left low (x, y)
    val hit5 = listOf(-1, -2)
    // bottom left high (x, y)
    val hit6 = listOf(-2, -1)

    // top left low (x, y)
    val hit7 = listOf(-2, 1)
    // top left high (x, y)
    val hit8 = listOf(-1, 2)

    fun isHit(hitList: List<Int>): Boolean {
        val (xHit, yHit) = hitList
        val isXHit = abs(x1 + xHit) == x2
        val isYHit = abs(y1 + yHit) == y2
        return isXHit && isYHit
    }

    if (isHit(hit1)) {
        return println("YES")
    }
    if (isHit(hit2)) {
        return println("YES")
    }
    if (isHit(hit3)) {
        return println("YES")
    }
    if (isHit(hit4)) {
        return println("YES")
    }
    if (isHit(hit5)) {
        return println("YES")
    }
    if (isHit(hit6)) {
        return println("YES")
    }
    if (isHit(hit7)) {
        return println("YES")
    }
    if (isHit(hit8)) {
        return println("YES")
    }

    println("NO")
}
