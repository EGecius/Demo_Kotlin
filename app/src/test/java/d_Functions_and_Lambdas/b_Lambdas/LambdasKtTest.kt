package d_Functions_and_Lambdas.b_Lambdas

import org.junit.Test

/**
 * Tests for [LambdasKt]
 */
class LambdasKtTest {

    @Test
    fun when__then() {
        //WHEN
        val toUpperCase = toUpperCase("one")
        //THEN
        assert(toUpperCase.equals("ONE"))
    }

    @Test
    fun toLowerCase() {
        //WHEN
        val toUpperCase = toLowerCase("ONE")
        //THEN
        assert(toUpperCase.equals("one"))
    }

    @Test
    fun transform() {
        //WHEN
        val result = transformString("one", { it -> it + it })
        assert(result.equals("oneone"))
    }

    @Test
    fun combineInts_sum() {
        val result = combineInts(2, 3, {a, b -> a + b})
        assert(result == 5)
    }

    @Test
    fun combineInts_multiply() {
        val result = combineInts(2, 3, {a, b -> a * b})
        assert(result == 6)
    }

    @Test
    fun `if last param is function, lambda can be placed outside parentheses`() {
        val result = combineInts(2, 3) {a, b -> a * b}
        assert(result == 6)
    }

    @Test
    fun transformString() {
        val result = "ONE".transform { it.toLowerCase() }
        assert(result.equals("one"))
    }

}