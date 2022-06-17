package decorator

class LoganTuning(private val logan: Logan) : Car by logan{

    override fun horsePower(): Int = logan.horsePower() * 100

}

fun LoganTuning.oil(type: String): String = "Castrol of $type"