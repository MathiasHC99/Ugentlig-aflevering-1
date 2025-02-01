package com.example.applikationsudvikling_ugentligaflevering1

fun main() {
    val max: Int = printMax(2,7,1)
    val min: Int = printMin(3,4,9)

    println(max)
    println(min)
}

fun printMax(a: Int, b:Int, c:Int): Int {
    return maxOf(a,b,c)
}
fun printMin(a: Int, b:Int, c:Int): Int {
    return minOf(a,b,c)
}