package com.example.applikationsudvikling_ugentligaflevering1

fun main( ) {
    println(validCpr("1503687721"))
    println(validCpr("1110217564"))
    println(validCpr("1505315241"))
    println(validCpr("5403939321"))
    println(validCpr("1417159002"))
    println(validCpr("23114234"))
}

fun validCpr(cpr: String): Boolean {
    return cpr.length == 10 &&
            cpr.all {it.isDigit()} &&
            cpr.substring(0,2).toInt() in 1..31 &&
            cpr.substring(2,4).toInt() in 1..12
}

