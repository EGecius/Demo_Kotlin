package a_GettingStarted.a_BasicSyntax

internal class CollectionsUsage {

    fun sum(collection: Collection<Int>): Int {

        var sum = 0
        for (integer in collection) {
            sum += integer;
        }

        return sum
    }

    fun contains(names: Collection<String>, text: String): Boolean {

        if (text in names) {
            // names.contains(text) is called
            return true
        }
        return false;

    }

    fun filter(names: Collection<String>) {

        names
                .filter { it.startsWith("A") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { print(it + " ") }
    }


}
