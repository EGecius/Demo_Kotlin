package c_Classes_and_Objects.f_Data_Classes

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Tests for [CopyingDataClass]
 */
class CopyingDataClassTest {

    internal var classUnderTest: CopyingDataClass = CopyingDataClass()

    @Test
    fun copying() {
        //WHEN
        val artist = Artist(5, "old_name", "url", "mbid")
        val copyArtist = classUnderTest.copyArtist(artist, "new_name")

        assertThat(artist.id).isEqualTo(copyArtist.id)
        assertThat(artist.url).isEqualTo(copyArtist.url)
        assertThat(artist.mbid).isEqualTo(copyArtist.mbid)

        assertThat(copyArtist.name).isEqualTo("new_name")
    }

}