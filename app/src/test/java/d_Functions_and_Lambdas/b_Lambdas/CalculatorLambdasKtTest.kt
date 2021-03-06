package d_Functions_and_Lambdas.b_Lambdas

import org.junit.Test

/**
 * Tests for [CalculatorLambdasKt]
 */
class CalculatorLambdasKtTest {

    @Test
    fun add() {
        val result = add(4, 3)
        assert(result == 7)
    }

    @Test
    fun deduct() {
        val result = deduct(4, 3)
        assert(result == 1)
    }

    @Test
    fun multiply() {
        val result = multiply(4, 3)
        assert(result == 12)
    }

    @Test
    fun divide() {
        val result = divide(27, 3)
        assert(result == 9)
    }

    @Test
    fun divideAlternative1() {
        val result = divideAlternative1(27, 3)
        assert(result == 9)
    }

    @Test
    fun divideAlternative2() {
        val result = divideAlternative2(27, 3)
        assert(result == 9)
    }

    @Test
    fun divideAlternative3() {
        val result = divideAlternative3(27, 3)
        assert(result == 9)
    }

}