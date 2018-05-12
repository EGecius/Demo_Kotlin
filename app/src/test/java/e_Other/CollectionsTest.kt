@file:Suppress("UNUSED_VARIABLE")

package e_Other

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CollectionsTest {

    @Test
    fun `create snapshot of list`() {
        val items = mutableListOf("one", "two")
        val snapshotList = items.toList()

        assertThat(snapshotList.size).isEqualTo(2)
        assertThat(snapshotList[0]).isEqualTo("one")
        assertThat(snapshotList[1]).isEqualTo("two")

        items.add("three")
//      snapshotList.add("three") //does not compile
    }

    @Test
    fun `demo hashMap creation`() {
        val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)

        assertThat(readWriteMap.get("foo")).isEqualTo(1)
        assertThat(readWriteMap["bar"]).isEqualTo(2)
    }

    @Test (expected = IllegalArgumentException::class)
    fun `requireNoNulls throws IllegalArgumentException`() {

        val listWithNull = listOf("one", null, "two")
        assertThat(listWithNull[1]).isNull()

        val listWithoutNulls = listWithNull.requireNoNulls()
    }

    @Test
    fun `requireNoNulls returns same list when no nulls found`() {

        val listWithNull = listOf("one", "two")

        val listWithoutNulls = listWithNull.requireNoNulls()
        assertThat(listWithoutNulls[0]).isEqualTo("one")
        assertThat(listWithoutNulls[1]).isEqualTo("two")
    }
}