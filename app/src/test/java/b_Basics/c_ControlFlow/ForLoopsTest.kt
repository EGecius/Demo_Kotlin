package b_Basics.c_ControlFlow

import org.junit.Test

/**
 * Tests for [ForLoops]
 */
class ForLoopsTest {

    internal var classUnderTest: ForLoops = ForLoops()

    @Test
    fun withIndices() {
        //WHEN
        classUnderTest.withIndices(intArrayOf(2, 4, 6, 8, 13))
        //THEN
    }

    @Test
    fun withIndexAndValue() {
        //WHEN
        classUnderTest.withIndexAndValue(intArrayOf(2, 4, 6, 8, 13))
        //THEN
    }


}