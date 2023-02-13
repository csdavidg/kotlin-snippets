package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallestPositiveIntegerTest {


    @Test
    fun testSmallestPositiveInteger() {
        val target = SmallestPositiveInteger()

        var values = arrayOf(1, 3, 6, 4, 1, 2)
        var result = target.findMissingValue(values)
        assertEquals(5, result)

        values = arrayOf(1, 2, 3)
        result = target.findMissingValue(values)
        assertEquals(4, result)
    }

}