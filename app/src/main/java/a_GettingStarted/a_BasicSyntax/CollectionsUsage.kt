package a_GettingStarted.a_BasicSyntax

internal class CollectionsUsage {

    fun sum(collection: Collection<Int>): Int {
        var sum = 0
        for (integer in collection) {
            sum += integer
        }
        return sum
    }

    /** Exactly same as above */
    fun sumSuccint(collection: Collection<Int>): Int {
        return collection.sum()
    }

    fun contains(names: Collection<String>, text: String): Boolean {
        if (text in names) {
            // names.contains(text) is called
            return true
        }
        return false
    }

    fun filterSorted(names: List<String>): List<String> {

        return names
                .filter { it.startsWith("A") }
                .sortedBy { it }
                .map { it.toUpperCase() }
    }

    fun filterUnsorted(names: List<String>): List<String> {
        return names
                .filter { it.startsWith("A") }
                .map { it.toUpperCase() }
    }

}
