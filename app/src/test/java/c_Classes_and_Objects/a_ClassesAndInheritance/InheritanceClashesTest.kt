package c_Classes_and_Objects.a_ClassesAndInheritance

import org.junit.Test

/**
 * Tests for [InheritanceClashes]
 */
class InheritanceClashesTest {

    internal var classUnderTest: InheritanceClashes = InheritanceClashes()

    @Test
    fun when__then() {
        //WHEN
        classUnderTest.f()
        print("--- \n")
        classUnderTest.a()
        classUnderTest.b()

        //THEN

    }

}