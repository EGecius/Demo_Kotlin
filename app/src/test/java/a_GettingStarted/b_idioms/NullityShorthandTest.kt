package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class NullityShorthandTest {

    @Test
    fun fileNUllCheck() {
        var array: Array<Int>? = null
        println(array?.size)

    }

    @Test (expected = IllegalStateException::class)
    fun elvisOperatorWithStatement() {
        val email = getNull() ?: throw IllegalStateException("Email is missing!")
    }

    private fun getNull(): String? {
        return null
    }

    @Test
    fun letBlock() {
        var isLetBlockExecuted = false
        val value = getNull()

        value?.let {
            isLetBlockExecuted = true
        }

        assertThat(isLetBlockExecuted).isFalse()
    }

    @Test
    fun letBlock2() {
        var isLetBlockExecuted = false
        val value = getNonNull()

        value?.let {
            isLetBlockExecuted = true
        }

        assertThat(isLetBlockExecuted).isTrue()
    }

    private fun getNonNull() = "NonNull"


}