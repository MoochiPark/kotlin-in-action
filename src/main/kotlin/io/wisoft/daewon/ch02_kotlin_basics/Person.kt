package io.wisoft.daewon.ch02_kotlin_basics

class Person(
    val name: String,       // 읽기 전용 프로퍼티. 비공개 필드, 게터를 만들어낸다.
    var isMarried: Boolean  // 쓸 수 있는 프로퍼티. 비공개 필드, 게터, 세터를 만들어낸다.
)