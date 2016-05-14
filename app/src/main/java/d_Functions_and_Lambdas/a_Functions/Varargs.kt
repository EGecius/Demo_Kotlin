package d_Functions_and_Lambdas.a_Functions

/**
 * Variable number of arguments
 */
class Varargs() {

    fun sum(vararg num: Int): Int {
        var sum = 0
        for (i in num) {
            sum += i
        }
        return sum
    }

    fun sumWithExtra(vararg values: Int, extra : Int): Int {
        var sum = 0
        for (i in values) {
            sum += i
        }

        sum += extra
        return sum
    }


}
