package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [ReturnOnWhenStatement]
 */
class ReturnOnWhenStatementTest {

    internal val tested: ReturnOnWhenStatement = ReturnOnWhenStatement()

    @Test
    fun when__then() {
        assertThat(tested.transform("zero")).isEqualTo(0)
        assertThat(tested.transform("one")).isEqualTo(1)
        assertThat(tested.transform("two")).isEqualTo(2)
    }

    @Test (expected = IllegalArgumentException::class)
    fun when__then_2() {
        assertThat(tested.transform("three")).isEqualTo(0)
    }


}