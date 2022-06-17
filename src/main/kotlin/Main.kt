class Person(val name: String, var married: Boolean)
fun main(args: Array<String>) {
    println("Hello World!")

    val a = 10
    val b = 22

    println(max(a,b))

    val person = Person("Cristian", false)
    println("${person.name} is married ${person.married}")
    person.married = true
    println("${person.name} is married ${person.married}")
}

//Block body
/*fun max(a :Int, b:Int) : Int{
    return if(a > b) a else b
}*/

// Expression Body
//fun max(a :Int, b:Int) : Int = if(a > b) a else b

//Expression Body without return type Ï
fun max(a :Int, b:Int) = if(a > b) a else b