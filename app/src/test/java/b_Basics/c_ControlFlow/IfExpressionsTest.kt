package b_Basics.c_ControlFlow

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [IfExpressions]
 */
class IfExpressionsTest {

    internal var classUnderTest: IfExpressions = IfExpressions()

    @Test
    fun traditional() {
        //WHEN
        val result = classUnderTest.getMaxWithTraditionalUsage(3, 4)
        //THEN
        assert(result == 4)
    }

    @Test
    fun AsExpression1() {
        //WHEN
        val result = classUnderTest.getMaxAsExpression1(3, 4)
        //THEN
        assert(result == 4)
    }

    @Test
    fun AsExpression2() {
        //WHEN
        val result = classUnderTest.getMaxAsExpression1(3, 4)
        //THEN
        assert(result == 4)
    }

    @Test
    fun AsExpression3() {
        val result = classUnderTest.getMaxAsExpression2(3, 4)

        assertThat(result).isEqualTo(4)
    }

}