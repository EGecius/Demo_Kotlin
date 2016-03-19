package a_a_BasicSyntax

import org.junit.Test

/**
 * Tests for [Loops]
 */
class LoopsTest {

    internal var loops = Loops()

    @Test
    fun when__then() {
        val array: IntArray = intArrayOf(1, 2, 3, 4)
        val sum = loops.sumWithForLoop(array)
        //THEN
        assert(sum == 10)
    }

    @Test
    fun when__then_2() {
        val array: IntArray = intArrayOf(1, 2, 3, 4)
        val sum = loops.sumWithWhileLoop(array)
        //THEN
        assert(sum == 10)
    }

}