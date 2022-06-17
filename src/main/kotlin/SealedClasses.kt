import Expression.Suma as Suma
import Expression.Number as Nume

fun main(args : Array<String>) {
    // (1 + 2) + 4
    val num1 = Nume(1)
    val num2 = Nume(2)
    val num4 = Nume(4)
    println(evaluation(Suma(Suma(num1, num2), num4)))
}

sealed class Expression {
    class Number(val number : Int) : Expression()
    class Suma(val numLeft : Expression, val numRight : Expression) : Expression()
}

fun evaluation(e: Expression): Int = when(e){
    is Nume -> e.number
    is Suma -> evaluation(e.numLeft) + evaluation(e.numRight)
}