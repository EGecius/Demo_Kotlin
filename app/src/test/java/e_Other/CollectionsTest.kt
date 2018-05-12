package e_Other

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CollectionsTest {

    @Test
    fun `demo hashMap creation`() {
        val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)

        assertThat(readWriteMap.get("foo")).isEqualTo(1)
        assertThat(readWriteMap["bar"]).isEqualTo(2)
    }
}