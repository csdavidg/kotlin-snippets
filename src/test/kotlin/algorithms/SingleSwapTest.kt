package algorithms

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SingleSwapTest {

    private val singleSwap = SingleSwap()

    @Test
    fun bankTest() {
        assertTrue(singleSwap.areAlmostEqual("bank", "kanb"))
    }

    @Test
    fun attackTestFalse() {
        assertFalse(singleSwap.areAlmostEqual("attack", "defend"))
    }

    @Test
    fun differentLengthTestFalse() {
        assertFalse(singleSwap.areAlmostEqual("banks", "kanb"))
    }

    @Test
    fun kelbTestFalse() {
        assertTrue(singleSwap.areAlmostEqual("kelb", "kelb"))
    }
}