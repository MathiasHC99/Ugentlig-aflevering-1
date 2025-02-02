package com.example.applikationsudvikling_ugentligaflevering1

fun main() {
    val numbers = listOf(0,10,12,11,34)
    println("Average: ${calAvg(numbers)}")
}

fun calAvg(numbers: List<Int>): Double {
    return numbers.average()
}


