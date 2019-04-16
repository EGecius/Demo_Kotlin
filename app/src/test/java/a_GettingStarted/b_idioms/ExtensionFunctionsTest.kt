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

}