package b_Basics.c_ControlFlow

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [BasicTypes]
 */
class BasicTypesTest {

    internal var tested: BasicTypes = BasicTypes()

    /* demonstrates how string can be formed in Kotlin */

    @Test
    fun when_getStringLiteralEscaped() {
        //WHEN
        val result = tested.getStringLiteralEscaped()
        //THEN
        assertThat(result).isEqualTo("hello \nworld")
    }

    @Test
    fun when_getStringLiteralRaw() {
        //WHEN
        val result = tested.getStringLiteralRaw()
        //THEN
        assertThat(result).isEqualTo("")
    }

    @Test
    fun when_getStringTemplate() {
    	//GIVEN
        val result = tested.getStringTemplate()
        assertThat(result).isEqualTo("i = 10")
    }

    @Test
    fun when_getStringTemplateWithArbitraryExpression() {
        //GIVEN
        val result = tested.getStringTemplateWithArbitraryExpression()
        assertThat(result).isEqualTo("abc.length is 3")
    }

}