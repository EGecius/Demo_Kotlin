package c_Classes_and_Objects.f_Data_Classes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import java.util.*

class ImmutableListWrapper_UsageTest {

    private lateinit var sample: ImmutableListWrapper_Usage
    private lateinit var list: ArrayList<String>

    @Before
    fun setup() {
        list = ArrayList()
        list.add(ORIGINAL_VALUE)
        sample = ImmutableListWrapper_Usage()
    }

    @Test
    fun when_listRetrieved_then_onlyAddedValuesFound() {
        //WHEN
        val (list) = sample.getImmutableListWrapper(list)
        //THEN

        assertThat(list.size).isEqualTo(1)
        assertThat(list[0]).isEqualTo(ORIGINAL_VALUE)
    }

    /** Shows that Kotlin's data class can be amended  */
    @Test
    fun when_listRetrieved_and_amended_then_originalIsAmended() {
        //WHEN
        val immutableListWrapper = sample.getImmutableListWrapper(list)
        val listRetrieved = immutableListWrapper.list
        //THEN
        assertThat(listRetrieved.size).isEqualTo(1)
        listRetrieved.clear()

        //list has been cleared - not immutable!
        assertThat(listRetrieved.size).isEqualTo(0)
    }

    companion object {

        private val ORIGINAL_VALUE = "original value"
    }

}