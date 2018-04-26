package a_GettingStarted.b_idioms

import org.junit.Test

class ListsTest {

    @Test
    fun asListReturnsImmutable() {
        val list = listOf(1, 2)

        // modifing Kotlin's list does not compile
//        list.add(3)

        val mutableList = mutableListOf(1, 2)
        mutableList.add(3)
    }

}