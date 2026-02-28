interface Clickable {
    fun click()

    fun showOff() = println("I'm Clickable")
}

interface Focusable {

    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {

    override fun click() = println("I was clicked")

    override fun showOff() {
        //This function must be implemented since both interfaces have an implementation
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }
}

open class RichButton : Clickable {

    fun disable() {

    }

    open fun animate() {

    }

    final override fun click() {
        println("Click richButton")
    }

}

abstract class Animated(val name: String) {

    abstract fun animate(): String

    open fun stopAnimating() {
        println("Stop Animating")
    }

    fun animateTwice() {
        println("Animate Again ${animate()}")
    }
}

class Car(private val carName: String) : Animated(carName) {

    override fun animate(): String {
        return "Start engine ion $carName"
    }

}

interface WithProperties {
    val email: String
    val emailStartsWitA: Boolean get() = email.startsWith("a")
}

class InheritGetterProperty(override val email: String) : WithProperties

fun main(args: Array<String>) {

    /*val objProperties = InheritGetterProperty("alejandra@gmail.com")
    println("The email starts with A? : ${objProperties.emailStartsWitA}")


    println("------------------------------")

    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()

    val car = Car("Chevrolet")
    println(car.animate())
    car.animateTwice()
    car.stopAnimating()

    val value: String? = null
    value.let {
        println(it?.uppercase())
    }*/
}

class CheckingInnerNested {
    val name = "David"

    class NestedExample {

    }

    inner class InnerExample {
        fun getOuterName(): String = this@CheckingInnerNested.name
    }
}