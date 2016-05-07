package a_GettingStarted.a_BasicSyntax

import org.junit.Test

/**
 * Tests for [ConditionalExpressions]
 */
class ConditionalExpressionsTest {

    internal var conditionals = ConditionalExpressions()

    @Test
    fun when__then() {
        val max = conditionals.max(3, 4)
        assert(max == 4)
    }

    @Test
    fun when__then_2() {
        val max = conditionals.maxInferred(3, 4)
        assert(max == 4)
    }

}