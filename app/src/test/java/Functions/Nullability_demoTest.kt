package Functions

import org.junit.Test

/**
 * Single Responsibility:

 * Tests for [Nullability_demo]
 */
class Nullability_demoTest {

    internal var demo: Nullability_demo = Nullability_demo()

    @Test
    fun when__then() {
        //WHEN
        demo.nonCompilingNullability()
        //THEN
    }

    @Test (expected = KotlinNullPointerException::class)
    fun when_thrownNpeBecauseOfExclamationMarks_then_throwsKotlinNullPointerException() {
        //WHEN
        demo.thrownNpeBecauseOfExclamationMarks()
        //THEN
    }

    @Test
    fun given_varNotNull_when_doesNotThrowNpeBecauseOfExclamationMarks_then_doesNotThrowException() {
        //GIVEN
        demo.setVarNotNull();
        //WHEN
        demo.thrownNpeBecauseOfExclamationMarks()
        //THEN
    }

}
