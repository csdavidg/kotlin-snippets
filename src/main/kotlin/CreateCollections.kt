import strings.lastChar
import strings.lastCharacter
import strings.printCollection

//Kotlin doesn’t have its own set of collection classes
//61600
fun main(args : Array<String>){
    val set = hashSetOf(1,2,3,4)
    val array = arrayListOf("a", "b", "c")

    val map = hashMapOf(1 to "one", 2 to "two")

    /*println(set.javaClass)
    println(array.javaClass)
    println(map.javaClass)

    getLastNumber()*/

    /*println(printCollection(collection = set, separator = ";", prefix = "(", suffix = ")"))
    println(printCollection(prefix = "(", suffix = ")", separator = ";", collection = array))
    println(printCollection(set))*/

    println(set.printCollection(separator = ";", prefix = "(", suffix = ")"))
    println(array.printCollection(prefix = "(", suffix = ")", separator = ";"))
    println(set.printCollection())


    println("Colombia".lastChar())//Extension function
    println("Colombia".lastCharacter)//Extension Property immutable

    val arrayNames = arrayOf("Cristian", "David", "Nicolas")
    //Spread operator, change an array to a vararg value
    printVarArgValues(*arrayNames)
}

fun getLastNumber(){

    val strings = listOf("first", "second", "fourteenth")

    println(strings.last())

    val numbers = setOf(1, 14, 2)

    println(numbers.maxOrNull())
}

fun printVarArgValues(vararg names: String){
    for(v in names){
        println(v)
    }
}
