package com.example.applikationsudvikling_ugentligaflevering1

fun main() {
    print("Please enter a grade score: ")
    val input = readln().toIntOrNull()

    if(input != null && input in 0..100){
        println("Your grade is: ${calculateGrade(input)}")
    } else {
        println("Please enter a valid grade score between 0 and 100:)")
    }
}

fun calculateGrade(grade: Int): String {
    return when (grade) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
}

