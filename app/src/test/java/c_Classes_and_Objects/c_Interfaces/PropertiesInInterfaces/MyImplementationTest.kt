package c_Classes_and_Objects.c_Interfaces.PropertiesInInterfaces

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


import org.assertj.core.api.Assertions.assertThat

/**
 * Tests for [MyImplementation]
 */
class MyImplementationTest {

    lateinit var myImpl: MyImplementation

    @Before
    fun setup() {
        myImpl = MyImplementation("my_property")
    }

    @Test
    fun when__then() {
        assertThat(myImpl.property).isEqualTo("my_property")
        assertThat(myImpl.propertyWithGetter).isEqualTo("set_in_interface")
    }

}