package a_GettingStarted.b_idioms

class SingleExpressionFunctions {


    fun transform(digit: String): Int = when (digit) {

        "zero" -> 0
        "one" -> 1
        "two" -> 2

        else -> {
            throw IllegalArgumentException()
        }
    }
}
