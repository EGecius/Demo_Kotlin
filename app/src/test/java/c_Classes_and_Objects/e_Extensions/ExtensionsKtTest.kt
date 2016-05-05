package c_Classes_and_Objects.e_Extensions

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

/**
 * Tests for [ExensionsKt]
 */
class ExtensionsKtTest {

    @Test
    fun callingExtensionOnMutableList() {

        //GIVEN
        val list = mutableListOf(1, 2, 3)

        //WHEN
        list.swap(0, 2)

        //THEN
        assertThat(list[0]).isEqualTo(3)
        assertThat(list[2]).isEqualTo(1)
    }

}