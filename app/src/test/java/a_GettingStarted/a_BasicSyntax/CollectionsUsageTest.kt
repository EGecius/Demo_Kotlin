package a_GettingStarted.a_BasicSyntax

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [CollectionsUsage]
 */
class CollectionsUsageTest {

    internal val collections = CollectionsUsage()

    @Test
    fun when__then() {
        val mutableListOf: MutableList<Int> = mutableListOf(1, 2, 3)
        val sum = collections.sum(mutableListOf)

        assertThat(sum).isEqualTo(6)
    }


    @Test
    fun when__then_2() {
        val mutableListOf = mutableListOf("Sam", "John", "Pete")
        val doesContain = collections.contains(mutableListOf, "Sam")

        assertThat(doesContain).isTrue()
    }

    @Test
    fun when__then_3() {
        val mutableListOf = mutableListOf("Sam", "John", "Pete")
        val doesContain = collections.contains(mutableListOf, "Carl")

        assertThat(doesContain).isFalse()
    }

    @Test
    fun when__then_4() {
        val collection = mutableListOf("Andy", "Abbey", "Sam", "John", "Pete")
        val sorted = collections.filterSorted(collection)

        assertThat(sorted.size).isEqualTo(2)
        assertThat(sorted[0]).isEqualTo("ABBEY")
        assertThat(sorted[1]).isEqualTo("ANDY")
    }

    @Test
    fun when__then_5() {
        val collection = mutableListOf("Andy", "Abbey", "Sam", "John", "Pete")
        val sorted = collections.filterUnsorted(collection)

        assertThat(sorted.size).isEqualTo(2)
        assertThat(sorted[0]).isEqualTo("ANDY")
        assertThat(sorted[1]).isEqualTo("ABBEY")
    }

}