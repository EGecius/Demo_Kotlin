package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [IfExpression]
 */
class IfExpressionTest {

    internal val tested: IfExpression = IfExpression()

    @Test
    fun when__then() {
        assertThat(tested.transform(1)).isEqualTo("one")
        assertThat(tested.transform(2)).isEqualTo("two")
        assertThat(tested.transform(3)).isEqualTo("default")
    }

}