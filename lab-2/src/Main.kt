import kotlin.random.Random

fun main() {
    val m = Random.nextInt(1, 100)
    val n = Random.nextInt(1, 200)

    val numbersWithMaxDivisors = findNumbersWithMaxDivisors(m, n)

    println("Случайный интервал: [$m, $n]")
    println("Числа из интервала с максимальным количеством делителей:")
    numbersWithMaxDivisors.forEach { println(it) }
}

fun countDivisors(number: Int): Int {
    var count = 0
    for (i in 1..number) {
        if (number % i == 0) {
            count++
        }
    }
    return count
}

fun findNumbersWithMaxDivisors(m: Int, n: Int): List<Int> {
    var maxDivisorsCount = 0
    val numbersWithMaxDivisors = mutableListOf<Int>()

    for (i in m..n) {
        val currentDivisorsCount = countDivisors(i)
        if (currentDivisorsCount > maxDivisorsCount) {
            maxDivisorsCount = currentDivisorsCount
            numbersWithMaxDivisors.clear()
            numbersWithMaxDivisors.add(i)
        } else if (currentDivisorsCount == maxDivisorsCount) {
            numbersWithMaxDivisors.add(i)
        }
    }
    return numbersWithMaxDivisors
}