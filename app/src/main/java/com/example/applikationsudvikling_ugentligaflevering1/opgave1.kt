package com.example.applikationsudvikling_ugentligaflevering1

fun main() {
    print("Please enter your age: ")
    val ageInput = readln()
    val age = ageInput.toInt()

    if (eligibleToVote(age)) {
        println("You're eligible to vote!")
    } else {
        println("You're not eligible to vote..")
    }
}

fun eligibleToVote(age: Int): Boolean {
    return age >= 18
}
