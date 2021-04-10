package io.wisoft.daewon.ch03DefiningAndCallingFunctions.strings

fun String.lastChar(): Char = get(lastIndex)

val String.lastChar: Char
    get() = get(lastIndex)

var StringBuilder.lastChar: Char
    get() = get(lastIndex)                // 프로퍼티 게터
    set(value: Char) {
        this.setCharAt(lastIndex, value)  // 프로퍼티 세터
    }


fun main() {
    println("adc".lastChar())
    println("abc".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
    print("abc".last())
}