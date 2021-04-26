package Ch03DefiningAndCallingFunctions.strings

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
    val list = listOf(1, 2, 3)
    println(list.joinToString("; ", "(", ")"))

    println(list.joinToString())
    println(list.joinToString("; "))
    println(list.joinToString(postfix = ";", prefix = "# "))
}
