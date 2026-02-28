data class Citizen(val name: String, val age: Int)

/*fun main(args: Array<String>) {

    /*val citizenList = listOf(Citizen("Cris", 12), Citizen("David", 21))

    println(citizenList.maxOf({ c: Citizen -> c.age }))
    println(citizenList.maxOf({ c -> c.age }))
    println(citizenList.maxOf { it.age })


    println(listOf(1, 2, 3, 4, 5).asSequence().map {
        println(it)
        it * it
    }.find { it > 3 })

    printAlphabet { alphabet() }*/
}*/

fun alphabet(): String {
    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        return toString()
    }
}

fun printAlphabet(alphabet: () -> String) {
    println(alphabet.invoke())
}

/*
----------------------------------------------------------------

Given the list of Strings
["abc", "def"]
Write Kotlin code to return a list containing all the individual characters in the list converted to uppercase.
Expected result
[A, B, C, D, E, F]
----------------------------------------------------------------

Given the list of persons
[Person("Bob", 10), Person("Alice", 20),
        Person("Jhon", 15), Person("Max", 10),
        Person("David", 15), Person("Marcos", 30)
]
Please write kotlin code to return
1. The older person
    Expected result
    Person(name=Alice, age=20)
2. Map of persons grouped by age
    Expected result
    {10=[Person2(name=Bob, age=10), Person2(name=Max, age=10)], 20=[Person2(name=Alice, age=20)], 15=[Person2(name=Jhon, age=15), Person2(name=David, age=15)]}
3. List of persons older than 20
    Expected result
    [Person2(name=Marcos, age=30)]
----------------------------------------------------------------
Given the data class
data class CustomerName(
    val name: String,
    val lastName: String,
    val num: Int,
    val mobile: String,
    val address: String,
    val city: String,
    val state: String
)

and the customer

val data = CustomerName(
        name = "Joseph",
        lastName = "Gonzalez",
        num = 10,
        mobile = "1234556",
        address = "4 Street",
        city = "CA",
        state = "CD"
    )

please update the lastName to Sanchez and print the old and new customer using the toString method
expected result
OLD = CustomerName(name=Joseph, lastName=Gonzalez, num=10, mobile=1234556, address=4 Street, city=CA, state=CD)
NEW = CustomerName(name=Joseph, lastName=Sanchez, num=10, mobile=1234556, address=4 Street, city=CA, state=CD)

----------------------------------------------------------------
Please create an extension function for List class that receives as argument a separator and returns all its members as string

Example 1
val list = listOf(1, 2, 3, 4, 5)
println(list.joinString("-"))
expected result 1-2-3-4-5

example 2
val list = listOf("January", "February", "March", "April", "May", "June")
println(list.joinString("/"))
expected result January/February/March/April/May/June
----------------------------------------------------------------

Please improve this extension function using kotlin best practices
1. Consider using any scope function
2. Consider using smart cast if appropriate
3. Consider using default values if appropriate

fun <T> List<T>.joinToStringFromList(separator: String?, prefix: Any?): String {
    val result = StringBuilder()
    var prefResult = ""
    if(prefix == null){
        prefResult = "List values: "
    } else if (prefix is Int){
        prefResult = (prefix * 100) as String
    } else {
        prefResult = prefix as String
    }

    result.append(prefResult)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            if(separator == null){
                result.append("-")
            } else {
                result.append(separator)
            }
        }
        result.append(element)
    }
    return result.toString()
}
*/

interface Customer {
    fun getCustomerName(): String
}

class CustomerImpl() {
    companion object : Customer {
        override fun getCustomerName(): String {
            return "Customer"
        }
    }
}

object LoadOtherCustomer : Customer {
    override fun getCustomerName(): String {
        TODO("Not yet implemented")
    }

}

fun <T> List<T>.joinToString(separator: String): String {
    return with(StringBuilder()) {
        for ((index, element) in this.withIndex()) {
            if (index > 0) append(separator)
            append(element)
        }
        return toString()
    }
}


fun <T> List<T>.joinToStringBetter(separator: String? = "-", prefix: Any? = "List values: "): String {
    with(StringBuilder()) {
        append(prefix as? String)
        for ((index, element) in this.withIndex()) {
            if (index > 0) append(separator)
            append(element)
        }
        return toString()
    }
}

fun <T> List<T>.joinToStringGPT(separator: String, prefix: Any?): String {
    return StringBuilder().run {
        append(prefix?.let { if (it is String) it else it.toString() } ?: "List values: ")
        this@joinToStringGPT.forEachIndexed { index, element ->
            if (index > 0) append(separator)
            append(element)
        }
        toString()
    }
}

fun <T> List<T>.joinToStringFromList(separator: String?, prefix: Any?): String {
    val result = StringBuilder()
    var prefResult = ""
    if(prefix == null){
        prefResult = "List values: "
    } else if (prefix is Int){
        prefResult = (prefix * 100) as String
    } else {
        prefResult = prefix as String
    }

    result.append(prefResult)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            if(separator == null){
                result.append("-")
            } else {
                result.append(separator)
            }
        }
        result.append(element)
    }
    return result.toString()
}

data class CustomerName(
    val name: String,
    val lastName: String,
    val num: Int,
    val mobile: String,
    val address: String,
    val city: String,
    val state: String
)

data class Person2(val name: String, val age: Int)

fun main(args: Array<String>) {
    val data = CustomerName(
        name = "Cristian",
        lastName = "Sanchez",
        num = 10,
        mobile = "1234556",
        address = "4 Street",
        city = "CA",
        state = "CD"
    )
    println(data)

    println(data.copy(lastName = "Gonzalez"))

    val list = listOf(1, 2, 3, 4, 5)
    println(list.joinToString("-"))

    val list2 = listOf("January", "February", "March", "April", "May", "June")
    println(list2.joinToString("/"))

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.uppercase().toList() })

    val persons = listOf(
        Person2("Bob", 10), Person2("Alice", 20),
        Person2("Jhon", 15), Person2("Max", 10),
        Person2("David", 15), Person2("Marcos", 30)
    )
    println(persons.maxByOrNull { it.age })
    println(persons.groupBy { it.age })
    println(persons.filter { it.age > 20 })



}