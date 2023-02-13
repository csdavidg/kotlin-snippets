import java.io.BufferedReader
import java.io.FileReader

class LambdaInlineFunctions {

    inline fun printSomething(make: (String) -> Boolean) {
        println(make("Hello"))
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { //This is the replacement for try with resource, works on every class that implements closable
            it.forEachLine { line -> println(line) }
        }
    }

    fun readFileReturn(path: String): String {
        BufferedReader(FileReader(path)).use { //This is the replacement for try with resource, works on every class that implements closable
            return it.readLine()
        }
    }

    inline fun readFromFileReturn(other: String, path: String, readFile: (lambdaPath: String) -> String) {
        println(readFile("src/main/resources/$path"))
    }

}

fun main(args: Array<String>) {
    val inlineFun = LambdaInlineFunctions()

    /*inlineFun.printSomething { it.equals("Hello") }

    inlineFun.readFile("src/main/resources/test.txt")*/
    inlineFun.readFromFileReturn("otherVal", "test.txt") { path -> inlineFun.readFileReturn(path) }
}