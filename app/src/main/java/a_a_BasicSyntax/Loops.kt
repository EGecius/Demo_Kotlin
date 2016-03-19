package a_a_BasicSyntax

internal class Loops {

    fun sumWithForLoop(array: IntArray): Int {

        var sum = 0;

        for (integer in array) {
            sum += integer;
        }

        return sum
    }

    fun sumWithWhileLoop(array: IntArray): Int {

        var i = 0;
        var sum = 0

        while (i < array.size) {
            sum += array[i++]
        }

        return sum
    }

}
