package io.wisoft.daewon.ch02_kotlin_basics.smartcast

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw IllegalStateException("Unknown expression")
    }

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalStateException("Unknown expression")
    }


fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}