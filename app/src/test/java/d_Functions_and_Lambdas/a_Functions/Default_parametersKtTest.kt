package d_Functions_and_Lambdas.a_Functions

import org.junit.Test

/**
 * Tests for [Default_parametersKt]
 */
class Default_parametersKtTest {

    @Test
    fun when__then() {
        //WHEN
        val length = testDefaultArguments(intArrayOf(1, 2, 3, 4))
        //THEN
        assert(length == 4)
    }

}