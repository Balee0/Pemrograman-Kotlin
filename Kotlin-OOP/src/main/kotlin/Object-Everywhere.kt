package org.example

fun main() {
    // Object Everywhere Pada Kotlin, nilai primitif seperti String, Integer, Char, Boolean merupakan sebuah Object.
    val someString = "123"
    val someInt = someString.toInt()
    val someMoreString = "12.12"
    val someDouble = someMoreString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)


}