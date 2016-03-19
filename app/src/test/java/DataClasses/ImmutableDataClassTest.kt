package DataClasses

import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class ImmutableDataClassTest {

    internal var immutable = ImmutableDataClass(1)

    @Test
    fun when_tryingToFindSetter_then_notFound() {
        /* wont compile: */
        //		immutable.setId
    }

    @Test
    fun when_gettingName_then_defaultNameFound() {
        assertThat(immutable.name).isEqualTo("default name")
    }

    @Test
    fun when_gettingId_then_setIdFound() {
        assertThat(immutable.id).isEqualTo(1)
    }

}
