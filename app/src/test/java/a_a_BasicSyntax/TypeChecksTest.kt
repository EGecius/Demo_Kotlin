package a_a_BasicSyntax

import org.junit.Assert.*
import org.junit.Test

/**
 * Tests for [TypeChecks]
 */
class TypeChecksTest {

    internal var classUnderTest = TypeChecks()

    @Test
    fun when__then() {
        //WHEN
        val doubleString = classUnderTest.getDoubleString("one.")
        //THEN
        assert(doubleString.equals("one.one."))
    }

    @Test
    fun when_nonStringPassed_then_nullReturned() {
        //WHEN
        val doubleString = classUnderTest.getDoubleString(3)
        //THEN
        assert(doubleString == null)
    }

}