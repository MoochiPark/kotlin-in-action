package io.wisoft.daewon.ch03DefiningAndCallingFunctions.varargs

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}