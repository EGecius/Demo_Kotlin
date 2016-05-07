package a_GettingStarted.a_BasicSyntax

internal class RangesUsage {

    fun sumInRangeOf(range: Int): Int {
        var sum = 0
        for (x in 1..range) {
            sum += x
        }
        return sum
    }

    fun sumInRangeOfExcludingLast(range: Int): Int {
        var sum = 0
        for (x in 1..range - 1) sum += x
        return sum
    }

    fun isIndexOutOfRange(index:Int, array: IntArray): Boolean {
        return index !in 0..array.lastIndex
    }
}
