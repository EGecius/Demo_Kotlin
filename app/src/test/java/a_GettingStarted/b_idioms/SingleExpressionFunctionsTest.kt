package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions
import org.junit.Test

/**
 * Tests for [SingleExpressionFunctions]
 */
class SingleExpressionFunctionsTest {

    internal var tested: SingleExpressionFunctions = SingleExpressionFunctions()

    @Test
    fun when__then() {
        Assertions.assertThat(tested.transform("zero")).isEqualTo(0)
        Assertions.assertThat(tested.transform("one")).isEqualTo(1)
        Assertions.assertThat(tested.transform("two")).isEqualTo(2)
    }

    @Test (expected = IllegalArgumentException::class)
    fun when__then_2() {
        Assertions.assertThat(tested.transform("three")).isEqualTo(0)
    }

}