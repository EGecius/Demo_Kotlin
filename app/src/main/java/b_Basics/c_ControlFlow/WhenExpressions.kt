package b_Basics.c_ControlFlow

/**
 * 'when' replaces 'switch'
 */
internal class WhenExpressions {

    fun asExpression(x: String): Boolean {

        val hasPrefix = when (x) {
            is String -> x.startsWith("prefix")
            else -> false
        }

        return hasPrefix
    }

    fun asStatement(x: Int) : String {

        val validNumbers = intArrayOf(3, 4)

        val result : String

        when (x) {
            1, 2 -> result = ONE_OR_TWO
            in validNumbers -> result = IN_VALID_NUMBERS
            in 5..10 -> result = BETWEEN_5_AND_10
            !in 11..20 -> result = OUTSIDE_RANGE
            else -> result = SOMETHING_ELSE
        }

        return result
    }

    fun expressionAsBranchCondition(x: Int) : String {

        val s = "five"

        when (x) {
            parseInt(s) -> return S_ENCODES_X
            else -> return S_DOES_NOT_ENCODE_X
        }
    }

    private fun parseInt(s: String): Int {
        if (s.equals("five")) {
            return 5
        } else {
            return -1
        }
    }


    companion object {
        val ONE_OR_TWO = "1 OR 2"
        val IN_VALID_NUMBERS = "in valid numbers"
        val BETWEEN_5_AND_10 = "BETWEEN_5_AND_10"
        val SOMETHING_ELSE = "SOMETHING_ELSE"
        val OUTSIDE_RANGE = "OUTSIDE_RANGE"
        val S_ENCODES_X = "S_ENCODES_X"
        val S_DOES_NOT_ENCODE_X = "S_DOES_NOT_ENCODE_X"
    }

}


