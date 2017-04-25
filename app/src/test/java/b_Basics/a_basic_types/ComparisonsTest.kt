package b_Basics.a_basic_types

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [Comparisons]
 */
class ComparisonsTest {

    var tested: Comparisons = Comparisons()

    /* By reference */

    @Test
    fun comparingByReference_sameString_returnsTrue() {
        //WHEN
        val string = "1"
        val isSame = tested.compareByReference(string, string)
        //THEN
        assertThat(isSame).isTrue()
    }

    @Test
    fun comparingByReference_sameStringButDifferentReferences_returnsTrue() {
        //WHEN
        val string1 = "1"
        val string2 = "1"
        val isSame = tested.compareByReference(string1, string2)
        //THEN
        assertThat(isSame).isTrue()
    }

    @Test
    fun comparingByReference_differentStrings_returnsFalse() {
        //WHEN
        val string1 = "1"
        val string2 = "2"
        val isSame = tested.compareByReference(string1, string2)
        //THEN
        assertThat(isSame).isFalse()
    }

    /* By equality */

    @Test
    fun comparingByEquality_sameStrings_returnsTrue() {
        //WHEN
        val string1 = "1"
        val string2 = "1"
        val isSame = tested.compareByEquality(string1, string2)
        //THEN
        assertThat(isSame).isTrue()
    }

    @Test
    fun comparingByEquality_differentStrings_returnsFalse() {
        //WHEN
        val string1 = "1"
        val string2 = "2"
        val isSame = tested.compareByEquality(string1, string2)
        //THEN
        assertThat(isSame).isFalse()
    }

}