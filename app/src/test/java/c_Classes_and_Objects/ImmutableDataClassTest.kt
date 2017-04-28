package c_Classes_and_Objects

import c_Classes_and_Objects.f_Data_Classes.ImmutableDataClass
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImmutableDataClassTest {


    companion object {

        const val DEFAULT_ID = 1
        const val DEFAULT_NAME = "default name"

    }

    internal var immutable = ImmutableDataClass(DEFAULT_ID)

    @Test
    fun when_tryingToFindSetter_then_notFound() {
        /* wont compile: */
        //		immutable.setId
    }

    @Test
    fun when_gettingName_then_defaultNameFound() {
        assertThat(immutable.name).isEqualTo(DEFAULT_NAME)
    }

    @Test
    fun when_gettingId_then_setIdFound() {
        assertThat(immutable.id).isEqualTo(DEFAULT_ID)
    }

    @Test
    fun componentsCorrespondToProperties() {
        assertThat(immutable.component1()).isEqualTo(DEFAULT_ID)
        assertThat(immutable.component2()).isEqualTo(DEFAULT_NAME)
    }

}
