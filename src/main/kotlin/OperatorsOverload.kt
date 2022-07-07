data class Point(val x: Int, val y: Int) {

    operator fun plus(otherPoint: Point): Point {
        return Point(x + otherPoint.x, y + otherPoint.y)
    }

}

fun main(args: Array<String>) {
    val p1 = Point(10, 10)
    val p2 = Point(1, 2)
    println(p1 + p2)//calls plus function
    println("Are the point equals ${p1 == p2}")

    var p5 = Point(11, 11)
    p5 += Point(1, 2)
    println(p5)//Also calls plus function, you can define plus or plusAssign operator function to use this operator

    val p3 = PointJava(100, 100)
    val p4 = PointJava(1, 2)
    println(p3 + p4)//calls plus function on java class

    var p6 = PointJava(1000, 1000)
    p6 += PointJava(3, 3)
    println(p6)

    val numbers = ArrayList<Int>()
    numbers += 42//calls predefined plusAssign function
    numbers += listOf(1, 2, 3, 4)
    numbers -= 42
    println(numbers)

}