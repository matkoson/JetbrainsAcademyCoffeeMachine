import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()

    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (balance < purchase) {
            return println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
        } else {
            balance -= purchase
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}
