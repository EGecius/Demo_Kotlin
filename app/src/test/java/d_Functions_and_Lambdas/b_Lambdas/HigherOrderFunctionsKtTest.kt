package d_Functions_and_Lambdas.b_Lambdas

import org.junit.Test

/**
 * Tests for [HigherOrderFunctionsKt]
 */
class HigherOrderFunctionsKtTest {

    @Test
    fun when__then() {
        //WHEN
        val result : String = transformWithHigherOrderFunction(5, ::covertToInt)
        //THEN
        assert(result.equals("5"))
    }
}

private fun covertToInt(int : Int): String {
    return int.toString()
}