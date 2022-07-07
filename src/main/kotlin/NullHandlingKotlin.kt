import java.util.*

class Address(
    val streetAddress: String,
    val zipCode: Int, val city: String, val country: String
)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person) {
    /*val address = person.company?.address ?: throw IllegalArgumentException("No Address found")
    with(address) {
        println(streetAddress)
        println("Ship to $country - $city - $zipCode")
    }*/

    person.company?.address?.let {
        println(it.streetAddress)
        println("Ship to ${it.country} - ${it.city} - ${it.zipCode}")
    } ?: throw IllegalArgumentException("No Address found, new version")
}

fun ignoreNulls(s: String?) {
    println(s!!.length)
}

fun printCitizenName(citizen: CitizenNullCheck?){
    citizen?.name?.let { it -> println(it.uppercase()) } ?: println("AnyOne")
}

fun main(args: Array<String>) {
    val address = Address(
        streetAddress = "Calle 66",
        zipCode = 111221, city = "Bogota", country = "Colombia"
    )
    val company = Company(name = "CrisCorp", address = address)
    val person = Person(name = "Cristian", company = company)

    printShippingLabel(person)

    /*val company2 = Company(name = "DavCorp", address = null)
    val person2 = Person(name = "David", company = company2)
    printShippingLabel(person2)

    val company3 = Company(name = "SanCorp", address = null)
    val person3 = Person(name = "Sanchez", company = null)
    printShippingLabel(person3)*/

    val citizen = CitizenNullCheck(null)
    printCitizenName(citizen)

    val citizen2 = CitizenNullCheck("Citizen Cristian")
    printCitizenName(citizen2)

    val x = 1
    val listOfLongs = listOf(1L, 2L, 3L)
    println(x.toLong() in listOfLongs)
    println(listOfLongs.contains(x.toLong()))

    val mutableList = mutableListOf(1,2,3,4)
    mutableList.add(5)
    println(mutableList)



}