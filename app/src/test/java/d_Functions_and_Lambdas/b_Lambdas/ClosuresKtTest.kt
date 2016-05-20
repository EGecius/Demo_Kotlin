package d_Functions_and_Lambdas.b_Lambdas

import org.junit.Test

/**
 * Tests for [ClosuresKt]
 */
class ClosuresKtTest {

    @Test
    fun when__then() {
        //WHEN
        val sum = sumOfArray(intArrayOf(1, 2, 3, 4))
        assert(sum == 10)
    }

}