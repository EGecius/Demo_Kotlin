package a_a_BasicSyntax

import org.junit.Assert.*
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

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
        val doesContain = collections.filter(collection)
    }

}