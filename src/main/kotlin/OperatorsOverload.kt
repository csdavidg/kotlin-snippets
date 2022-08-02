import java.time.LocalDate

data class Point(val x: Int, val y: Int) {

    operator fun plus(otherPoint: Point): Point {
        return Point(x + otherPoint.x, y + otherPoint.y)
    }

    operator fun get(index: Int): Int {
        return when (index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid index for point")
        }
    }

}

data class MutablePoint(var x: Int, var y: Int) {

    operator fun plus(otherPoint: Point): MutablePoint {
        return MutablePoint(x + otherPoint.x, y + otherPoint.y)
    }

    operator fun get(index: Int): Int {
        return when (index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid index for point")
        }
    }

    operator fun set(index: Int, value: Int) {
        when (index) {
            0 -> x = value
            1 -> y = value
            else -> throw IndexOutOfBoundsException("Invalid index for point")
        }
    }

}

data class Rectangle(val upperLeft: Point, val lowerRight: Point) {
    operator fun contains(p: Point): Boolean {
        return p.x in upperLeft.x until lowerRight.x && p.y in upperLeft.y until lowerRight.y
    }
}

data class Employee(val firstName: String, val lastName: String) : Comparable<Employee> {
    override fun compareTo(other: Employee): Int {
        return compareValuesBy(this, other, Employee::firstName, Employee::lastName)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(10, 10)
    val p2 = Point(1, 2)
    println(p2[1]) // uses the get function
    println(p1 + p2)//calls plus function
    println("Are the point equals ${p1==p2}")

    var p5 = Point(11, 11)
    p5 += Point(1, 2)
    println(p5)//Also calls plus function, you can define plus or plusAssign operator function to use this operator

    val p3 = PointJava(100, 100)
    val p4 = PointJava(1, 2)
    println(p3 + p4)//calls plus function on java class

    var p6 = PointJava(1000, 1000)
    p6 += PointJava(3, 3)
    println(p6)

    var p7 = MutablePoint(1, 2)
    p7[0] = 10
    p7[1] = 20
    println("mutable map $p7")

    val numbers = ArrayList<Int>()
    numbers += 42//calls predefined plusAssign function
    numbers += listOf(1, 2, 3, 4)
    numbers -= 42
    println(numbers)

    val rectangle = Rectangle(Point(0,1), Point(5,6))
    val result = Point(5,9) in rectangle
    println("the point is in $result")

    val now = LocalDate.now()
    val vacation = now .. now.plusDays(10)
    println(now.plusDays(5) in vacation)

}