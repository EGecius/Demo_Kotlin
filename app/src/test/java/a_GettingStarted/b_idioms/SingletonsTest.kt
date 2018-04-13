package a_GettingStarted.b_idioms

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SingletonsTest {

    private var mSut: Singletons? = null

    @Before
    fun setUp() {
        mSut = Singletons()
    }

    @Test
    fun singletonFieldsCanBeAccessedDirectly() {
        assertThat(Resource.name).isEqualTo("Egis")

        assertThat(Resource.nameAppended("my_append")).isEqualTo("Egis_my_append")
    }

}