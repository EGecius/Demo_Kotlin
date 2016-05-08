package c_Classes_and_Objects.f_Data_Classes

internal class CopyingDataClass {

    fun copyArtist(artist: Artist, newName: String): Artist =
            artist.copy(artist.id, newName, artist.url, artist.mbid)

}

