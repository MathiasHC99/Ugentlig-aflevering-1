package com.example.applikationsudvikling_ugentligaflevering1

fun main() {
    print("Please enter your full name: ")
    val fullName = readln().trim()
    println("Abbreviated name: ${abbreviateName(fullName)}")
}

fun abbreviateName(fullName: String): String {
    val nameParts = fullName.trim().split(" ")
    if (nameParts.size == 1) return fullName

    val firstAndMiddleAbbreviations = nameParts.dropLast(1)
        .joinToString(".") { name -> name.first().uppercaseChar().toString() } + "."

    val lastName = nameParts.last()

    return "$firstAndMiddleAbbreviations $lastName"
}
