package a_GettingStarted.a_BasicSyntax

import b_Basics.c_ControlFlow.WhenExpressions
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Tests for [WhenExpressions]
 */
class WhenExpressionsTest {

    internal var classUnderTest: WhenExpressions = WhenExpressions()

    @Test
    fun asExpression() {
        //WHEN
        val hasPrefix = classUnderTest.asExpression("prefix_Value")
        //THEN
        assert(hasPrefix)
    }

    @Test
    fun asExpression2() {
        //WHEN
        val hasPrefix = classUnderTest.asExpression("Value")
        //THEN
        assert(!hasPrefix)
    }


    @Test
    fun asStatement() {
        //WHEN
        val result = classUnderTest.asStatement(1)
        //THEN
        assert(result.equals(WhenExpressions.ONE_OR_TWO))
    }


    @Test
    fun asStatement2() {
        //WHEN
        val result = classUnderTest.asStatement(3)
        //THEN
        assert(result.equals(WhenExpressions.IN_VALID_NUMBERS))
    }

    @Test
    fun asStatement3() {
        //WHEN
        val result = classUnderTest.asStatement(5)
        //THEN
        assert(result.equals(WhenExpressions.BETWEEN_5_AND_10))
    }

    @Test
    fun asStatement4() {
        //WHEN
        val result = classUnderTest.asStatement(11)
        //THEN
        assert(result.equals(WhenExpressions.SOMETHING_ELSE))
    }

    @Test
    fun expressionAsBranchCondition() {
        //WHEN
        val result = classUnderTest.expressionAsBranchCondition(5)
        //THEN
        assert(result.equals(WhenExpressions.S_ENCODES_X))
    }

    @Test
    fun expressionAsBranchCondition2() {
        //WHEN
        val result = classUnderTest.expressionAsBranchCondition(6)
        //THEN
        assert(result.equals(WhenExpressions.S_DOES_NOT_ENCODE_X))
    }

    @Test
    fun rangeIsInclusive() {
        assertTrue(1 in 1..3)
        assertTrue(3 in 1..3)
    }

    @Test (expected = AssertionError::class)
    fun rangeIsInclusive2() {
        assertTrue(4 in 1..3)
    }

}