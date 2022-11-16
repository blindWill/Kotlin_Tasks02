fun main() {
    println(center(mutableListOf(3.0, 5.0, 10.0, 2.2, 6.6)))
    println(times(listOf(8, 7, 1), listOf(5, 3, 2)))
}

fun center(list: MutableList<Double>): MutableList<Double> {
    return if (list.isNotEmpty()) {
        val arithmeticMean = list.sum() / list.size
        for (i in list.indices) {
            list[i] -= arithmeticMean
        }
        list
    } else {
        list
    }
}

fun times(a: List<Int>, b: List<Int>): Int {
    var dotProduct = 0
    for (i in a.indices){
        dotProduct += a[i] * b[i]
    }
    return dotProduct
}

/**
 * Средняя (3 балла)
 *
 * Найти скалярное произведение двух векторов равной размерности,
 * представленные в виде списков a и b. Скалярное произведение считать по формуле:
 * C = a1b1 + a2b2 + ... + aNbN. Произведение пустых векторов считать равным 0.
 */