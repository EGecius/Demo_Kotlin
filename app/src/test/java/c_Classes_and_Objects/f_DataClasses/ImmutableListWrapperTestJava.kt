package c_Classes_and_Objects.f_DataClasses

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImmutableListWrapperTestJava {

    private var injectedList = mutableListOf(ORIGINAL_VALUE)

    @Test
    fun when_then() {
        val valueFound = injectedList[0]

        assertThat(valueFound).isEqualTo(ORIGINAL_VALUE)
    }

    companion object {

        const val ORIGINAL_VALUE = "original value"
    }

}
