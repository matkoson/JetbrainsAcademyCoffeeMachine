import java.util.*

enum class CountryCurrency(val currencyName: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar"),
}

fun main() {
    val scanner = Scanner(System.`in`)
    val country1 = scanner.next()
    val country2 = scanner.next()

    fun findByName(name: String): String {
        for (country in CountryCurrency.values()) {
            if (name.uppercase() == country.name) {
                return country.currencyName
            }
        }
        return ""
    }

    println(findByName(country1) == findByName(country2))
}
