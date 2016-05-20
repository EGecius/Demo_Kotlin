package d_Functions_and_Lambdas.b_Lambdas

import org.junit.Before
import org.junit.Test

/**
 * Tests for [FunctionLiteralsWithReceiver]
 */
class FunctionLiteralsWithReceiverTest {

    internal lateinit  var classUnderTest: FunctionLiteralsWithReceiver

    @Before
    fun setup() {
        classUnderTest = FunctionLiteralsWithReceiver()
    }

    @Test
    fun when__then() {
        val sum = classUnderTest.useLiteral(4, 5)
        assert(sum == 9)
    }

}