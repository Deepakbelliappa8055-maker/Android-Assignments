package com.pes.lib

fun main() {

    val data = "Hi! How are you?"

    // 1. how many vowels in the string

    // 2. how many spaces

    // use of 'when' as a expression

    var vowelCount = 0
    var spaceCount = 0

    for (ch in data) {

        // when as statement
        // when(ch){
        //     'a','e','i','o','u' -> vowelCount++
        //     ' ' -> spaceCount++
        // }

        // When as expression
        val result = when (ch) {
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U' -> "vowel"

            ' ' -> "space"

            else -> "other"
        }

        if (result == "vowel")
            vowelCount++

        if (result == "space")
            spaceCount++
    }

    println("Vowel count: $vowelCount")
    println("Space count: $spaceCount")
}