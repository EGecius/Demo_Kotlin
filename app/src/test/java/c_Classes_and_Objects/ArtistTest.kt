package c_Classes_and_Objects

import c_Classes_and_Objects.f_Data_Classes.Artist
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ArtistTest {

    private var artist: Artist? = null

    @Before
    fun setup() {
        artist = Artist(ID.toLong(), "name", "url", "mbid")
    }

    @Test
    fun when_instantiated_thenSettersStillWork() {
        assertThat(artist!!.id).isEqualTo(ID.toLong())

        artist!!.id = NEW_ID

        assertThat(artist!!.id).isEqualTo(NEW_ID)
    }

    companion object {

        private val ID = 1
        private val NEW_ID : Long = 2
    }
}
