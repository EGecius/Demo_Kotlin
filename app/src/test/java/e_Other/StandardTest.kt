package e_Other

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StandardTest {

    @Test
    fun `demo run()`() {

        val result = "13".let { it: String -> it.toInt() }

        assertThat(result).isEqualTo(13)
    }

    @Test
    fun `demo also()`() {
        "13"
                .also { println("printed in also: $it") }
                .also { println("from second also: $it") }
    }

    @Test
    fun `demo takeIf()`() {
        val result1 = "13".takeIf { it == "13" }

        assertThat(result1).isEqualTo("13")

        val result2 = "13".takeIf { it == "0" }

        assertThat(result2).isNull()
    }

    @Test
    fun `demo takeUnless()`() {
        val result0 = "1".takeUnless { it == "0" }

        assertThat(result0).isEqualTo("1")

        val result1 = "1".takeUnless { it == "1" }

        assertThat(result1).isNull()
    }

}