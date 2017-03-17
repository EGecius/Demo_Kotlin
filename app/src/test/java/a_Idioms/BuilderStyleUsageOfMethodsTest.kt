package a_Idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [BuilderStyleUsageOfMethods]
 */
class BuilderStyleUsageOfMethodsTest {

   val tested = BuilderStyleUsageOfMethods()

    @Test
    fun when__then() {
        //WHEN
        val arrayOfMinusOnes = tested.arrayOfMinusOnes(3)
        //THEN
        assertThat(arrayOfMinusOnes.size).isEqualTo(3)
        assertThat(arrayOfMinusOnes[0]).isEqualTo(-1)
        assertThat(arrayOfMinusOnes[1]).isEqualTo(-1)
        assertThat(arrayOfMinusOnes[2]).isEqualTo(-1)
    }

}