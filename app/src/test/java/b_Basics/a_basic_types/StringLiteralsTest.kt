package b_Basics.a_basic_types

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class StringLiteralsTest {

    @Test
    fun removesLeadingWhitespace() {

        val text = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin()

        val expected =
                """Tell me and I forget.
Teach me and I remember.
Involve me and I learn.
(Benjamin Franklin)"""

        assertThat(text).isEqualTo(expected)
    }

}