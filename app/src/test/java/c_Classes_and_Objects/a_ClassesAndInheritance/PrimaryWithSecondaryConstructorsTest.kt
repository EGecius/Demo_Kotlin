package c_Classes_and_Objects.a_ClassesAndInheritance

import org.junit.Test

/**
 * Tests for [PrimaryWithSecondaryConstructors]
 */
class PrimaryWithSecondaryConstructorsTest {

    internal var classUnderTest: PrimaryWithSecondaryConstructors  = PrimaryWithSecondaryConstructors("Egis", "Gecius")

    @Test
    fun instantiateClass() {
        print(classUnderTest.name);
    }

}