package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BuilderStyleText {

    @Test
    fun builder() {
        val arrayOfMinusOnes = arrayOfMinusOnes(3)

        assertThat(arrayOfMinusOnes).isEqualTo(arrayOf(-1, -1, -1))
    }

    private fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }


}
