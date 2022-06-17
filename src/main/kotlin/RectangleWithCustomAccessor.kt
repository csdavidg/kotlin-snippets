fun main(vars:Array<String>) {

    val rectangle = Rectangle(4,4)
    println(rectangle.isSquare)

    val rectangle2 = Rectangle(4,6)
    println(rectangle2.isSquare)

    println(Color.BLUE.rgb())

    println(getMnemonic(Color.VIOLET))

    println(getWarmth(Color.ORANGE))

    println(mix(Color.YELLOW, Color.RED))
    validateColor(Color.INDIGO)
}

class Rectangle(val height : Int, val with: Int){

    val isSquare: Boolean get() = height == with

}

enum class Color(val r : Int, val g: Int, val b: Int){
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0,0,255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

}

fun validateColor(color: Color) {

    val message : String  = when {
        (color.r == 255) -> "red or yellow"
        (color.g == 255) -> "blue or red"
        (color.b == 255) -> "blue"
        else -> throw Exception("None of the colors matches the values")
    }

    println(message)

}

fun getMnemonic(color: Color) = when(color) {
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
}

fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun mix(c1 : Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    setOf(Color.YELLOW, Color.RED) -> Color.RED
    else -> throw java.lang.Exception("Dirty Color")
}
