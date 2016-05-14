package a_GettingStarted.a_BasicSyntax

import org.junit.Test

/**
 * Tests for [LocalFunctions]
 */
class LocalFunctionsTest {

    internal var classUnderTest: LocalFunctions = LocalFunctions()
    
    @Test
    fun when__then() {
        //WHEN
        val sum = classUnderTest.sumAndDouble(1, 2, 3)
        //THEN
        assert(sum == 12)
    }

}