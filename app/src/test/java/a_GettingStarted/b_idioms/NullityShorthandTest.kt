package a_GettingStarted.b_idioms

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
        val email = getEmail() ?: throw IllegalStateException("Email is missing!")
    }

    private fun getEmail(): String? {
        return null
    }


}