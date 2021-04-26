package Ch04ClassObjectInterface.`interface`

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class OldButton : Clickable {
    override fun click() = println("I was clicked")
}


fun main() {
    Button().click()
}
