package d_Functions_and_Lambdas.a_Functions

import java.util.*

/**
 * Variable number of arguments
 */
class Varargs {

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

    fun passSingleArgumentsAndArraysIntoVararg() {

        val a = arrayOf(1, 2, 3)
        // asList takes vararg T but you can pass both arrays and single elements with spread
        // operator
        val list = Arrays.asList(-1, 0, *a, 4)
    }

}
