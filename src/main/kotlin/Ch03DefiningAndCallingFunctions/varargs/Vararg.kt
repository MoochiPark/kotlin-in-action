package Ch03DefiningAndCallingFunctions.varargs

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}
