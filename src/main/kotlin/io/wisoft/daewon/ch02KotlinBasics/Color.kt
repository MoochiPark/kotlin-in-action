package io.wisoft.daewon.ch02KotlinBasics

import io.wisoft.daewon.ch02KotlinBasics.Color.*

enum class Color(
    val r: Int, val g: Int, val b: Int      // 상수의 프로퍼티 정의
) {
    RED(255, 0, 0),               // 상수를 생성할 때 프로퍼티 값 지
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);        // 반드시 세미콜론을 사용해야 한다

    fun rgb() = (r * 256 + g) * 256 + b     // enum 클래스 안에서 메서드 정의
}

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "Richard"
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cool"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Error("Dirty color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == BLUE && c2 == YELLOW) ||
                (c1 == YELLOW && c2 == BLUE) -> GREEN
        (c1 == BLUE && c2 == VIOLET) ||
                (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Error("Dirty color")
    }

fun main() {
    println(GREEN.rgb())
    println(getMnemonic(GREEN))
    println(mix(BLUE, YELLOW))
    println(mixOptimized(BLUE, YELLOW))
}