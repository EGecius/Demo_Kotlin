package e_Other

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RangesTest {

    @Test
    fun `demo rangeTo()`() {
    	val number = 1
        val intRange: IntRange = number.rangeTo(5)

        assertThat(intRange.start).isEqualTo(1)
        assertThat(intRange.contains(2))
        assertThat(intRange.contains(3))
        assertThat(intRange.contains(4))
        assertThat(intRange.endInclusive).isEqualTo(5)

        assertThat(intRange.toString()).isEqualTo("1..5")
    }
}