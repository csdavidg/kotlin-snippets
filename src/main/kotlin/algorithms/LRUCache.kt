package algorithms

import java.time.LocalDateTime
import java.time.ZoneId
import kotlin.concurrent.timer

class LRUCache(var capacity: Int) {

    var numElements: Int = 0
    var values = arrayOfNulls<Int>(capacity)
    var times = ArrayDeque<Int>(capacity)

    operator fun get(key: Int): Int? {
        if (key > capacity - 1) {
            return null
        }
        times.add(1)
        return values[key]
    }

    fun put(key: Int, value: Int) {
        val position = computePosition(key)
        if (numElements == capacity) {


        } else if (values[position] == null || values[position] == value) {
            values[position] = value
        } else {
            times.add(key)
            values[position] = value
            numElements++
        }
    }

    private fun getTimeInMillis() = LocalDateTime.now()
        .atZone(ZoneId.systemDefault())
        .toInstant()
        .toEpochMilli()

    private fun computePosition(hashCode: Int): Int {
        return hashCode % capacity;
    }

}

fun main(args: Array<String>) {
    /* val cache = LRUCache(3)
    cache.values[2] = 19
    println(cache.values)

    var times = ArrayDeque<Int>(2)
    times.add(1)
    times.add(2)
    times.add(3)
    times.add(4)
    println(times) */

    println("start")
    timer
    println("HOLLA")

}

    val timer: String get() {
            println("Executed")
            return "Hello"
        }

