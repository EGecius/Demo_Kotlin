package a_GettingStarted.a_BasicSyntax

class LocalFunctions{

    fun sumAndDouble(vararg values: Int): Int {

        var sum = 0

        fun double(i: Int): Int {
            return i * 2
        }

        for (i in values) {
            sum += double(i)
        }

        return sum
    }

}
