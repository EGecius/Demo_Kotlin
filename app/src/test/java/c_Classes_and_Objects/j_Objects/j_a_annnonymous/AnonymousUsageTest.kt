package c_Classes_and_Objects.j_Objects.j_a_annnonymous

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [AnonymousUsage]
 */
class AnonymousUsageTest {

    val client = Client()
    val target: AnonymousUsage = AnonymousUsage(client)

    @Test
    fun when__then() {
        //WHEN
        assertThat(target.hasClicked).isFalse()
        //THEN
        target.setListenerAndCallClick()

        target.hasClicked
        assertThat(target.hasClicked).isTrue()
    }

}