package a_a_BasicSyntax

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Tests for [DefiningFunctions]
 */
class DefiningFunctionsTest {

    internal var functions: DefiningFunctions  = DefiningFunctions()

    @Test
    fun when__then() {
        //WHEN
        val sum = functions.sum(2, 3)
        assert(sum == 5)
    }

    @Test
    fun when__then_2() {
        //WHEN
        val sum = functions.sumInferredReturnType(2, 3)
        assert(sum == 5)
    }


}