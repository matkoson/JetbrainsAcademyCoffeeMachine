// complete this function, add default values
const val INITIAL_CAR_PRICE = 20_000
const val AUTOMATIC_TRANSMISSION_COST = 1500
const val DEFAULT_MAXIMUM_SPEED = 120
const val DEFAULT_MILEAGE = 100_000
const val DEFAULT_AGE = 5
const val MILEAGE_PENALTY = 200
const val MAX_SPEED_COST_PER_K_H = 100
const val AGE_PENALTY = 2000
fun carPrice(
    old: Int = DEFAULT_AGE,
    kilometers: Int = DEFAULT_MILEAGE,
    maximumSpeed: Int = DEFAULT_MAXIMUM_SPEED,
    automatic: Boolean = false
) {
    val priceAfterOld = INITIAL_CAR_PRICE - old * AGE_PENALTY
    val priceAfterKilometers = priceAfterOld - (kilometers / 10_000 * MILEAGE_PENALTY)
    val priceAfterMaximumSpeed =
        if (maximumSpeed < DEFAULT_MAXIMUM_SPEED) priceAfterKilometers - (DEFAULT_MAXIMUM_SPEED - maximumSpeed * MAX_SPEED_COST_PER_K_H) else priceAfterKilometers + (maximumSpeed - DEFAULT_MAXIMUM_SPEED * MAX_SPEED_COST_PER_K_H)
    val priceAfterAutomatic =
        if (automatic) priceAfterMaximumSpeed + AUTOMATIC_TRANSMISSION_COST else priceAfterMaximumSpeed

    println(priceAfterAutomatic)
}
