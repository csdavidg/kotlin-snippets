package decorator

interface Car {
    fun horsePower() : Int
    fun brake() : String
    fun tires() : String
}

fun main(args: Array<String>){

    val logan = Logan()
    println(logan.horsePower())
    println(logan.brake())

    val loganTuning = LoganTuning(logan)

    println(loganTuning.horsePower())
    println(loganTuning.brake())
    println(loganTuning.oil("wd40"))

}