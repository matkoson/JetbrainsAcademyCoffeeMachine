fun main() {
    // put your code here
    val durationInDays = readln().toInt()
    val totalFoodCostPerDay = readln().toInt()
    val oneWayFlightCost = readln().toInt()
    val oneNightHotelCost = readln().toInt()

    val totalFoodCost = durationInDays * totalFoodCostPerDay
    val totalFlightsCost = oneWayFlightCost * 2
    val totalHotelCost = oneNightHotelCost * (durationInDays - 1)

    println(totalFoodCost + totalFlightsCost + totalHotelCost)
}
