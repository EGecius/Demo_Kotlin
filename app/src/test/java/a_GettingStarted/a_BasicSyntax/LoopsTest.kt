package a_GettingStarted.a_BasicSyntax

import org.assertj.core.api.Assertions.assertThat
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

    @Test
    fun when__then_3() {
        val sum = loops.sumWithForiLoopReplacement(4)
        //THEN
        assert(sum == 10)
    }

    @Test
    fun loopWitIndices() {
        val modifiedItems = mutableListOf<String>()

        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            val newString = "item at $index is ${items[index]}"
            modifiedItems.add(newString)
        }

        val expectedList = listOf(
                "item at 0 is apple",
                "item at 1 is banana",
                "item at 2 is kiwifruit")
        assertThat(modifiedItems).isEqualTo(expectedList)
    }

}