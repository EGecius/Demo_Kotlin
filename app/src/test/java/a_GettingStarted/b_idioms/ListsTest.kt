package a_GettingStarted.b_idioms

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ListsTest {

    @Test (expected = UnsupportedOperationException::class)
    fun asListReturnsImmutable() {
        val list = listOf(1, 2)

        // modifing Kotlin's list does not compile
//        list.add(3)

        val mutableList = mutableListOf(1, 2)
        mutableList.add(3)
    }

}