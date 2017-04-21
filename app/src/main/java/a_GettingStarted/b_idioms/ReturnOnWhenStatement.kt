package a_GettingStarted.b_idioms

class ReturnOnWhenStatement {

    fun transform(digit: String): Int {
        return when (digit) {
            "zero" -> 0
            "one" -> 1
            "two" -> 2
            else -> throw IllegalArgumentException("Invalid digit param value")
        }
    }

}