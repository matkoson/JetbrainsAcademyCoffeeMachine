import java.lang.Math.pow

fun f(x: Double): Double {
    return if (x <= 0) {
        f1(x)
    } else if (0 < x && x < 1) {
        f2(x)
    } else if (x >= 1) {
        f3(x)
    } else {
        throw IllegalArgumentException("x must be a number")
    }
}

// implement your functions here
fun f1(x: Double): Double {
    return pow(x, 2.toDouble()) + 1
}

fun f2(x: Double): Double {
    return 1 / (pow(x, 2.toDouble()))
}

fun f3(x: Double): Double {
    return pow(x, 2.toDouble()) - 1
}
