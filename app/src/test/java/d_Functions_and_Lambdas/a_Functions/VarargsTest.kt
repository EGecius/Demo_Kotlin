package d_Functions_and_Lambdas.a_Functions

import org.junit.Test

/**
 * Tests for [Varargs]
 */
class VarargsTest {

    internal var classUnderTest: Varargs = Varargs()


    @Test
    fun varargsSimple() {
        //WHEN
        val sum = classUnderTest.sum(1, 2, 4)
        //THEN
        assert(sum == 7)
    }

    @Test
    fun varargsSimple2() {
        //WHEN
        val sum = classUnderTest.sum(4)
        //THEN
        assert(sum == 4)
    }


    /**
     * If there are are more arguments then just varargs, you can pass more with with name variables.
     * If already passing an array, prefix it with '*'
     * */
    @Test
    fun varargsWithMoreArgs() {
        //WHEN
        val intArray = intArrayOf(1, 2, 3)
        val sum = classUnderTest.sumWithExtra(values = *intArray, extra = 4)
        //THEN
        assert(sum == 10)
    }

}