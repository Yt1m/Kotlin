fun main() {
    val school = arrayOf(
        arrayOf(25, 28, 30, 26, 24),
        arrayOf(27, 29, 26, 28, 30),
        arrayOf(23, 25, 24, 22, 26),
        arrayOf(30, 29, 28, 27, 25),
        arrayOf(24, 23, 25, 26, 27),
        arrayOf(28, 27, 29, 30, 26),
        arrayOf(22, 24, 25, 23, 27),
        arrayOf(26, 28, 29, 30, 25),
        arrayOf(25, 27, 26, 24, 28),
        arrayOf(29, 30, 28, 27, 26),
        arrayOf(30, 28, 27, 29, 26)
    )
    var totalStudents = 0

    for (parallel in school) {
        for (studentsInClass in parallel) {
            totalStudents += studentsInClass
        }
    }

    println("Общее количество учеников в школе: $totalStudents")
}
