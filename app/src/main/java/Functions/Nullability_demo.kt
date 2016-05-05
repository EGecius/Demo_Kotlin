package Functions

import c_Classes_and_Objects.DataClasses.Artist

/**
 * Shows how code does not compile if NPE becomes a possibility.
 * To see that uncomment code where needed.
 */
class Nullability_demo {

    var nullableArtist : Artist? = null

    internal fun successfulInstantiation() {
        val artist = Artist(0, "egis", "url", "mbid")
        val string = artist.toString()
    }

    internal fun nonCompilingNullability() {

        //This won´t compile. Artist can´t be null
        var notNullArtist: Artist = Artist(0, "egis", "url", "mbid")

        //Artist can be null
        var artist: Artist? = null

//        // Won´t compile, artist could be null and we need to deal with that
//        artist.print()
//
//        // Will print only if artist != null
//        artist?.print()
//
//        // Smart cast. We don´t need to use safe call operator if we previously checked nullity
//        if (artist != null) {
//            artist.print()
//        }
//
//        // Only use it when we are sure it´s not null. Will throw KotlinNullPointerException otherwise.
//        artist!!.print()
//
//        // Use Elvis operator to give an alternative in case the object is null
//        val name = artist?.name ?: "empty"
    }

    fun thrownNpeBecauseOfExclamationMarks() {
        nullableArtist!!.print()
    }

    fun setVarNotNull() {
        nullableArtist = Artist(0, "name", "url", "mbdi")
    }

}
