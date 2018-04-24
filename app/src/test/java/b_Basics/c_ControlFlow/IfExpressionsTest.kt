package b_Basics.c_ControlFlow

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [IfExpressions]
 */
class IfExpressionsTest {

    internal var sut: IfExpressions = IfExpressions()

    @Test
    fun traditional() {
        //WHEN
        val result = sut.getMaxWithTraditionalUsage(3, 4)
        //THEN
        assert(result == 4)
    }

    @Test
    fun asExpression1() {
        //WHEN
        val result = sut.getMaxAsExpression1(3, 4)
        //THEN
        assert(result == 4)
    }

    @Test
    fun asExpression2() {
        //WHEN
        val result = sut.getMaxAsExpression1(3, 4)
        //THEN
        assert(result == 4)
    }

    @Test
    fun asExpression3() {
        val result = sut.getMaxAsExpression2(3, 4)

        assertThat(result).isEqualTo(4)
    }

}