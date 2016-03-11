package Functions

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Single Responsibility:

 * Tests for [Nullability_demo]
 */
class Nullability_demoTest {

    internal var classUnderTest: Nullability_demo = Nullability_demo()

    @Test
    fun when__then() {
        //WHEN
        classUnderTest.nonCompilingNullability()
        //THEN
    }

    @Test (expected = KotlinNullPointerException::class)
    fun when_thrownNpeBecauseOfExclamationMarks_then_throwsKotlinNullPointerException() {
        //WHEN
        classUnderTest.thrownNpeBecauseOfExclamationMarks()
        //THEN
    }


}