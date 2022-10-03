fun polynomial(x: Int, c: Int, b: Int = 0, a: Int = 0): Int {
    return if (b == 0 && a == 0) {
        c
    } else if (a == 0) {
        b * x + c
    } else {
        a * x * x + b * x + c
    }
}
