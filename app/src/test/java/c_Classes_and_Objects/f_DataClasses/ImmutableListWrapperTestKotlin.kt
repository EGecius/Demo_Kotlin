package c_Classes_and_Objects.f_DataClasses

import c_Classes_and_Objects.DataClasses.ImmutableListWrapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import java.util.*

/**
 * This shows that Kotlin's data classes's lists cannot be modified
 */
class ImmutableListWrapperTestKotlin {

    lateinit internal var wrapper: ImmutableListWrapper

    @Before
    fun setup() {
        val list = ArrayList<String>()
        list.add("original")
        wrapper = ImmutableListWrapper(list)
    }

    /** Lists retrieved are read-only */
    @Test
    fun when_getCalled_then_originalValueFound() {
        //WHEN
        val list: List<String> = wrapper.list;

        val valueFound = list.get(0);

        //THEN
        assertThat(valueFound).isEqualTo("original")
    }

    /** Lists retrieved are read-only */
    @Test
    fun when_getCalled_then_cantBeAdded() {
        //WHEN
        val list: List<String> = wrapper.list;

        // does not compile because Kotlin's List has no setters and seem to be immutable
//        val valueFound = list.add("my_string");
    }

}