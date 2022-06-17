import java.util.TreeMap

fun main(args: Array<String>) {
    for(i in 1 .. 100){
        println(fizzBuzz(i))
    }

    for (i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }

    // 1 to 99, until does not include the number indicated
    for (i in 1 until 100){
        println(i)
    }

    iteratingMaps()

    iteratingLists()

}

fun fizzBuzz(num: Int): String = when {
    (num % 3 == 0 && num % 5 == 0) -> "FizzBuzz"
    (num % 3 == 0) -> "Fizz"
    (num % 5 == 0) -> "Buzz"
    else -> "$num"
}

fun iteratingMaps() {
    val map = TreeMap<Char, String>()

    for(c in 'A' .. 'F'){
        map[c] = Integer.toBinaryString(c.code)
    }

    for((character, binary) in map){
        println("the binary of $character is $binary" )
    }
}

fun iteratingLists() {
    val listOfWords = arrayListOf("a", "b", "c")

    for((index, letter) in listOfWords.withIndex()){
        println("the letter $letter is stored in the index $index")
    }
}


class Cycles {
}