package c_Classes_and_Objects.b_Properties_and_Fields

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [GettersAndSetters]
 */
class GettersAndSettersTest {

    internal var tested: GettersAndSetters = GettersAndSetters()

    /* this test shows that 'val' property via a custom getter can return different values */

    @Test
    fun when__then() {
        //WHEN
        assertThat(tested.size).isEqualTo(0)
        assertThat(tested.isEmpty).isTrue()

        tested.size = 13

        assertThat(tested.size).isEqualTo(13)
        assertThat(tested.isEmpty).isFalse()
    }

}