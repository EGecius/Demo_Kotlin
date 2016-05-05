package c_Classes_and_Objects.DataClasses

/**
 * The following are generated for you:
     * getters & setters
     * toString
     * hashCode
     * equals
 */
data class Artist(
        var id: Long,
        var name: String,
        var url: String,
        var mbid: String) {

    fun print() {
        print(toString())
    }
}
