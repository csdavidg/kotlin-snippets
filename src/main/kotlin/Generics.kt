class Generics {

    fun sumNumbers(list: Collection<*>) {
        val intList = list as? List<Int> ?: throw IllegalArgumentException("list is not a a list")
        print(intList.sum())
    }

}

fun main(args: Array<String>) {
    val generics = Generics()
    generics.sumNumbers(listOf(1, 2, 3))

    generics.sumNumbers(listOf("1", "2", "3"))
}