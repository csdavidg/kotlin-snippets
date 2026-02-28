class EnumTests {


}

enum class Cities(val value: String) {
    BOGOTA("B"),
    CALI("C"),
    ARMENIA("A"),
    UNKNOWN("UNKNOWN");

    companion object {
        private val mapValues = Cities.values().associateBy(Cities::value)
        fun from(value: String) = mapValues[value] ?: UNKNOWN
    }
}

fun main(args: Array<String>) {
    println(Cities.valueOf("BOGOTA"))
    println(Cities.from("B"))
    println(Cities.from("C"))
    println(Cities.from("A"))
    println(Cities.from("Z"))

}