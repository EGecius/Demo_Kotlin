package c_Classes_and_Objects.f_Data_Classes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DestructuringInLambdasTest {

    val map: Map<Int, String> = mapOf(0 to "0", 1 to "1")

    @Test
    fun `maps simply`() {

        val mappedValues: Map<Int, Int> = map.mapValues {
            entry -> entry.value.toInt()
        }

        assertThat(mappedValues[0]).isEqualTo(0)
        assertThat(mappedValues[1]).isEqualTo(1)
    }

    @Test
    fun `maps with string manipulation`() {

        val mappedValues: Map<Int, String> = map.mapValues { entry -> "${entry.value}!" }

        assertThat(mappedValues[0]).isEqualTo("0!")
        assertThat(mappedValues[1]).isEqualTo("1!")
    }

    @Test
    fun `maps with destructuring operation`() {

        val mappedValues: Map<Int, Int> = map.mapValues {
            (key, value) -> value.toInt()
        }

        assertThat(mappedValues[0]).isEqualTo(0)
        assertThat(mappedValues[1]).isEqualTo(1)
    }
}
