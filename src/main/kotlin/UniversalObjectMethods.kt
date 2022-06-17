/*
class Client(val name: String, val postalCode: Int) {

    override fun equals(other: Any?): Boolean =
        if (other == null || other !is Client) {
            false
        } else {
            name == other.name && postalCode == other.postalCode
        }


    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

}
*/
data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {

    val c1 = Client("Cristian", 11221)
    val c2 = Client("Cristian", 11221)

    println(c1 == c2)

    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))

}