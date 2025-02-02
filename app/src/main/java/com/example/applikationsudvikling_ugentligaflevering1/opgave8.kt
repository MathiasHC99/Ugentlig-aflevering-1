package com.example.applikationsudvikling_ugentligaflevering1

fun main() {
    val words = listOf("lizard","cat","dog","elephant","bear","Mathias")
    val minLength = 4

    val filteredWords = filterWordsByLength(words, minLength)
    println("Words longer or equal to ${minLength}: $filteredWords")
}

fun filterWordsByLength(words: List<String>, minLength: Int): List<String>{
    return words.filter {word -> word.length >= minLength}
}