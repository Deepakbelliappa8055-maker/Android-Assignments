package com.pes.lib

fun convert(names: Array<String?>) {

  for (name in names) {

    // 1. explicit null check
    if (name != null) {
      println("Explicit null check: ${name.uppercase()}")
    }

    // 2. safe call operator
    println("Safe call operator: ${name?.uppercase()}")

    // 3. elvis operator
    val upperName = name?.uppercase() ?: "UNKNOWN"
    println("Elvis operator: $upperName")

    // 4. assertion operator
    if (name != null) {
      println("Assertion operator: ${name!!.uppercase()}")
    }

    println()
  }
}

fun main() {

  convert(arrayOf("john", null, "merry", "robert"))
}
