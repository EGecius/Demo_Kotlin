package a_GettingStarted.a_BasicSyntax

import org.junit.Assert.*
import org.junit.Test

import org.assertj.core.api.Assertions.assertThat

/**
 * Tests for [RangesUsage]
 */
class RangesTest {

    internal var ranges = RangesUsage()

    @Test
    fun when__then() {
        //WHEN
        val sum = ranges.sumInRangeOf(5)
        //THEN
        assertThat(sum).isEqualTo(15)
    }

    @Test
    fun when__then_2() {
        //WHEN
        val sum = ranges.sumInRangeOfExcludingLast(5)
        //THEN
        assertThat(sum).isEqualTo(10)
    }

    @Test
    fun when__then_3() {

        val array = intArrayOf(1, 2, 3, 4)

        //WHEN
        val out = ranges.isIndexOutOfRange(3, array)
        //THEN
        assertThat(out).isEqualTo(false)
    }

    @Test
    fun when__then_4() {

        val array = intArrayOf(1, 2, 3, 4)

        //WHEN
        val out = ranges.isIndexOutOfRange(4, array)
        //THEN
        assertThat(out).isEqualTo(true)
    }

}