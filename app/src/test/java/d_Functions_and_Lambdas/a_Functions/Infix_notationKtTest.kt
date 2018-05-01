package d_Functions_and_Lambdas.a_Functions

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class Infix_notationKtTest {

    //define extension to nt
    infix fun Int.plus(addition: Int): Int {
        return this + addition
    }

    @Test
    fun useInfixFunction() {
        // call extension function using infix notation
        val total1 = 1 plus 2

        // is the same as
        val total2 = 1.plus(2)

        assertThat(total1).isEqualTo(3)
        assertThat(total2).isEqualTo(3)
    }

}