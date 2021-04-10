package io.wisoft.daewon.ch02KotlinBasics

fun main(args: Array<String>) {
    println("Hello, World!")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}