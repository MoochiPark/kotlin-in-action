package io.wisoft.daewon.ch01WhatAndWhy

data class Person(                         // 데이터 클래스
    val name: String,
    val age: Int? = null                   // null 가능 타입과 디폴트 값
)

fun main(args: Array<String>) {            // 최상위 함수
    val persons = listOf(
        Person("영희"),
        Person("철수", age = 29)    // 이름 붙은 파라미터
    )
    val oldest = persons.maxByOrNull {
        it.age ?: 0                       // 람다식과 엘비스 연산자
    }
    println(
        "나이가 가장 많은 사람: $oldest"   // 문자열 템플릿
    )

}

// >>> 나이가 가장 많은 사람: Person(name=철수, age=29) toString 자동 생성