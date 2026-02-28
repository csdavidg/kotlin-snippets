class Person1(val name: String, var married: Boolean)
fun main(args: Array<String>) {

    println("Hello World!")
    val list = listOf(Transaction(1, "Dec1"),
        Transaction(2, "Decs2"),
        Transaction(3, "Dec3"),
        Transaction(4, "Dec4"),
        Transaction(1, "Dec1"),
        Transaction(1, "Dec1"))

    val noRepeat = list.toSet()
    print(noRepeat)

    /*val a = 10
    val b = 22

    println(max(a,b))

    val person = Person1("Cristian", false)
    println("${person.name} is married ${person.married}")
    person.married = true
    println("${person.name} is married ${person.married}")*/
}

data class Transaction(
    val id: Int,
    val description: String)

//Block body
/*fun max(a :Int, b:Int) : Int{
    return if(a > b) a else b
}*/

// Expression Body
//fun max(a :Int, b:Int) : Int = if(a > b) a else b

//Expression Body without return type Ï
fun max(a :Int, b:Int) = if(a > b) a else b