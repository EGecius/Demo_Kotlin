package c_Classes_and_Objects.e_Extensions

import org.junit.Test

/**
 * Tests for [F]
 */
class FTest {

    internal var classUnderTest: F = F()

    @Test
    fun when__then() {
        // will print member
        classUnderTest.foo()
    }

}