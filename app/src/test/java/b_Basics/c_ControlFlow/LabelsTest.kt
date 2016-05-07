package b_Basics.c_ControlFlow

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [Labels]
 */
class LabelsTest {

    internal var classUnderTest: Labels = Labels()

    @Test
    fun labelForLambda() {
        //WHEN
        val result = classUnderTest.labelForLambda(intArrayOf(1, 2, 3, 4, 5))
        //THEN
        assertThat(result).isEqualTo(arrayListOf(1, 2, 4, 5))
    }

    @Test
    fun labelForForEach() {
        //simply prints values
        classUnderTest.labelForForEach(intArrayOf(1, 2, 3, 4, 5))
    }

    @Test
    fun nestedForLoops() {
        classUnderTest.nestedForLoops()
    }

}