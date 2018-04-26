package c_Classes_and_Objects.f_DataClasses

import c_Classes_and_Objects.f_Data_Classes.ImmutableListWrapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ImmutableListWrapperTestJava {

    private var injectedList = mutableListOf(ORIGINAL_VALUE)
    private lateinit var wrapper: ImmutableListWrapper

    @Before
    fun setup() {
        wrapper = ImmutableListWrapper(injectedList)
    }

    @Test
    fun when_then() {
        val valueFound = injectedList[0]

        assertThat(valueFound).isEqualTo(ORIGINAL_VALUE)
    }

    companion object {

        const val ORIGINAL_VALUE = "original value"
    }

}
