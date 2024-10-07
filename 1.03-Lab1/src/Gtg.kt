fun main() {
    val rainfall = arrayOf(2, 3, 0, 5, 6, 1, 4, 8, 7, 0, 3, 6, 2, 4, 5, 7, 1, 0, 3, 5, 2, 4, 1, 8, 0, 6, 7, 2)

    var evenDaysRainfall = 0
    var oddDaysRainfall = 0

    for (day in rainfall.indices) {
        if ((day + 1) % 2 == 0) {
            evenDaysRainfall += rainfall[day]
        } else {
            oddDaysRainfall += rainfall[day]
        }
    }


    println("Сумма осадков по четным дням: $evenDaysRainfall")
    println("Сумма осадков по нечетным дням: $oddDaysRainfall")

    if (evenDaysRainfall > oddDaysRainfall) {
        println("По четным числам выпало больше осадков.")
    } else if (evenDaysRainfall < oddDaysRainfall) {
        println("По нечетным числам выпало больше осадков.")
    } else {
        println("По четным и нечетным числам выпало одинаковое количество осадков.")
    }
}

