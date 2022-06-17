fun main(args : Array<String>) {
    // (1 + 2) + 4
    val num1 = Num(1)
    val num2 = Num(2)
    val num4 = Num(4)
    println(eval(Sum(Sum(num1, num2), num4)))
}

interface Expr
class Num(val number : Int) : Expr
class Sum(val numLeft : Expr, val numRight : Expr) : Expr

/*fun eval(e : Expr) : Int {
    if (e is Num) {
        return e.number
    }
    if (e is Sum) {
        return eval(e.numRight) + eval(e.numRight)
    }
    throw IllegalArgumentException("Unknown Expression")
}*/

//Improving eval function using if expression
/*fun eval(e: Expr): Int =
    if (e is Num) {
        e.number
    } else if (e is Sum) {
        eval(e.numRight) + eval(e.numRight)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }*/

//Improving even more the eval function using when expression
fun eval(e: Expr): Int = when(e){
    is Num -> e.number
    is Sum -> eval(e.numLeft) + eval(e.numRight)
    else -> throw IllegalArgumentException("Unknown Expression")
}

