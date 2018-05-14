package e_Other

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NullSafety {

    @Test
    fun `demo let`() {

        val listWithNulls: List<String?> = listOf("A", null)
        for (item in listWithNulls) {
            item?.let { println(it) } // prints A and ignores null
        }
    }

    class MyClass

    @Test
    fun `let can be used ony object`() {

        val myClass = MyClass()
        myClass.let { println(it) }
    }

    @Test
    fun `demo filterNotNull()`() {
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()

        assertThat(intList).containsExactly(1, 2, 4)
    }

}
