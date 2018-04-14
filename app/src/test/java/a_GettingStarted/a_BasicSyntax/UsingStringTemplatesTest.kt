package a_GettingStarted.a_BasicSyntax

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

    @Test
    fun templateDemo2() {
        val s1 = "a is 1"

        val s2 = "${s1.replace("is", "was")} but now is 2"

        assertThat(s2).isEqualTo("a was 1 but now is 2")
    }

}