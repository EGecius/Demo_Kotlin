package a_GettingStarted.a_BasicSyntax

import org.junit.Assert.*
import org.junit.Test

/**
 * Tests for [WhenReplacesSwitch]
 */
class WhenReplacesSwitchTest {

    internal var classUnderTest = WhenReplacesSwitch()

    @Test
    fun when__then() {
        //WHEN
        val result = classUnderTest.useWhen(1);
        //THEN
        assert(result.equals("one"))
    }

    @Test
    fun when__then_2() {
        //WHEN
        val result = classUnderTest.useWhen(2);
        //THEN
        assert(result.equals("two"))
    }

    @Test
    fun when__then_3() {
        //WHEN
        val result = classUnderTest.useWhen("trys");
        //THEN
        assert(result.equals("three"))
    }

    @Test
    fun when__then_4() {
        //WHEN
        val array = intArrayOf(1);
        val result = classUnderTest.useWhen(array);
        //THEN
        assert(result.equals("not string"))
    }

}