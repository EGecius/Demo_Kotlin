package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ExtensionFunctionsTest {

    private var mSut: ExtensionFunctions? = null

    @Before
    fun setUp() {
        mSut = ExtensionFunctions()
    }

    @Test
    fun `toIntOrNull works`() {

        assertThat("one".toIntOrNull()).isNull()
        assertThat("two".toIntOrNull()).isNull()

        assertThat("1".toIntOrNull()).isEqualTo(1)
        assertThat("11".toIntOrNull()).isEqualTo(11)
    }

    @Test
    fun `indexOfFirst works`() {
        val list = listOf("zero", "one", "two", "three", "two", "two")

        val result = list.indexOfFirst {
            it == "two"
        }

        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `indexOfLast works`() {
        val list = listOf("zero", "one", "two", "three", "two", "two")

        val result = list.indexOfLast {
            it == "two"
        }

        assertThat(result).isEqualTo(5)
    }


    @Test
    fun `forEachIndexed works`() {
        val list = listOf("zero", "one", "two", "three", "two", "two")

        list.forEachIndexed{index: Int, string: String ->

            println("$index $string")

        }
    }

}