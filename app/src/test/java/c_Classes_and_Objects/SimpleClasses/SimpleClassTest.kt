package c_Classes_and_Objects.SimpleClasses

import org.junit.Assert.*
import org.junit.Test

import org.assertj.core.api.Assertions.assertThat

/**
 * Tests for [SimpleClass]
 */
class SimpleClassTest {

    internal var simpleClass = SimpleClass("my_title")

    @Test
    fun when__then() {
        //WHEN
        val toString = simpleClass.toString()
        //THEN
        assertThat(toString).isEqualTo("my_title")
    }

}