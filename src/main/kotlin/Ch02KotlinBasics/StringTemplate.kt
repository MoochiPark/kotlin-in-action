package Ch02KotlinBasics

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")
}
