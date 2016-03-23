package c_Classes_and_Objects.b_Properties_and_Fields

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.*

/**
 * Tests for [ListWrapper]
 */
class ListWrapperTest {

    @Test
    fun when_initializedToTwoMembers_then_sizeIsTwo() {
        //WHEN
        var listWrapper: ListWrapper = init2()
        //THEN
        assertThat(listWrapper.size).isEqualTo(2)
    }

    private fun init0(): ListWrapper {
        val list = ArrayList<String>()
        var listWrapper: ListWrapper = ListWrapper(list)
        return listWrapper
    }

    private fun init2(): ListWrapper {
        val list = ArrayList<String>()
        list.add("one")
        list.add("two")

        var listWrapper: ListWrapper = ListWrapper(list)
        return listWrapper
    }

    @Test
    fun when_initializedToTwoMembers_then_isEmptyIsFalse() {
        //WHEN
        var listWrapper: ListWrapper = init2()
        //THEN
        assertThat(listWrapper.isEmpty).isFalse()
    }

    @Test
    fun when_initializedToTwoMembers_then_isEmptyIsTrue() {
        //WHEN
        var listWrapper: ListWrapper = init0()
        //THEN
        assertThat(listWrapper.isEmpty).isTrue()
    }

}