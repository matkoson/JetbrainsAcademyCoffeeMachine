import java.lang.Math.abs
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextInt()
    val y1 = scanner.nextInt()
    val x2 = scanner.nextInt()
    val y2 = scanner.nextInt()

    if ((x1 == x2 || y1 == y2) || abs(x1 - x2) == abs(y1 - y2)) {
        println("YES")
    } else {
        println("NO")
    }
}
