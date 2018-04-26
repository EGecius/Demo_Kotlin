package c_Classes_and_Objects.f_Data_Classes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImmutableListWrapper_UsageTest {

    private var sample = ImmutableListWrapper_Usage()
    private var list = arrayListOf(ORIGINAL_VALUE)

    @Test
    fun when_listRetrieved_then_onlyAddedValuesFound() {
        val (list) = sample.getImmutableListWrapper(list)

        assertThat(list.size).isEqualTo(1)
        assertThat(list[0]).isEqualTo(ORIGINAL_VALUE)
    }

    /** Shows that Kotlin's data class can be amended  */
    @Test
    fun when_listRetrieved_and_amended_then_originalIsAmended() {
        val immutableListWrapper = sample.getImmutableListWrapper(list)
        val listRetrieved = immutableListWrapper.list

        assertThat(listRetrieved.size).isEqualTo(1)
        listRetrieved.clear()

        //list has been cleared - not immutable!
        assertThat(listRetrieved.size).isEqualTo(0)
    }

    companion object {

        private const val ORIGINAL_VALUE = "original value"
    }

}