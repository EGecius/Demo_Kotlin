package a_a_BasicSyntax

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [UsingStringTemplates]
 */
class UsingStringTemplatesTest {

    internal var templates = UsingStringTemplates()

    @Test
    fun templateDemo() {
        val array = arrayOf("vienas")
        val firstArg: String = templates.applyTemplate(array)
        assertThat(firstArg).isEqualTo("First argument: vienas")
    }

}