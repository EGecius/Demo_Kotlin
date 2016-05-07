package z_android

import org.junit.Before
import org.junit.Test

/**
 * Tests for [ParentType]
 */
class ParentTypeTest {

    internal lateinit  var classUnderTest: ParentType

    @Before
    fun setup() {
        classUnderTest = ParentType()
    }

    @Test
    fun showsThatExtendedMethod_unlikeStaticMethods_canAccessInstanceVariables() {
        //WHEN
        val result = classUnderTest.callExtendedMethod();

        classUnderTest.publicString;

        assert(result.equals(classUnderTest.publicString + classUnderTest.publicString))

        //THEN

    }

}