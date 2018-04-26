package c_Classes_and_Objects.f_DataClasses

import c_Classes_and_Objects.f_Data_Classes.ImmutableListWrapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.*

/**
 * For som reason tests do not run in this class. Is it because I am trying to test Kotlin class in Java?
 */
@RunWith(JUnit4::class)
class ImmutableListWrapperTestJava {
    private lateinit var wrapper: ImmutableListWrapper
    private var injectedList: ArrayList<String>? = null


    @Before
    fun setup() {
        injectedList = ArrayList()
        injectedList!!.add(ORIGINAL_VALUE)
        wrapper = ImmutableListWrapper(injectedList!!)
    }

    @Test
    fun when_then() {
        //WHEN
        val valueFound = injectedList!![0]
        //THEN
        assertThat(valueFound).isEqualTo(ORIGINAL_VALUE)
    }

    companion object {

        val ORIGINAL_VALUE = "original value"
    }


}
