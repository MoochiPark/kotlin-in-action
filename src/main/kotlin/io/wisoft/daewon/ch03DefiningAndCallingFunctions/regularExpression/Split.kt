package io.wisoft.daewon.ch03DefiningAndCallingFunctions.regularExpression

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun String.parsePath(regex: Regex) {
    val matchResult = regex.matchEntire(this)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main() {
    println("12.345-6.A".split(".", "-"))

    parsePath("/User/daewon/kotlin-in-action/chapter.adoc")
    "/User/daewon/kotlin-in-action/chapter.adoc".parsePath("""(.+)/(.+)\.(.+)""".toRegex())
}