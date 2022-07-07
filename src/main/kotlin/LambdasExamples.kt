data class Citizen(val name: String, val age: Int)

fun main(args: Array<String>) {

    val citizenList = listOf(Citizen("Cris", 12), Citizen("David", 21))

    println(citizenList.maxOf({ c: Citizen -> c.age }))
    println(citizenList.maxOf({ c -> c.age }))
    println(citizenList.maxOf { it.age })


    println(listOf(1, 2, 3, 4, 5).asSequence().map {
        println(it)
        it * it
    }.find { it > 3 })

    printAlphabet { alphabet() }

}

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