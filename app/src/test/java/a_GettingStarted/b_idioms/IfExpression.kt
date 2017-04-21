package a_GettingStarted.b_idioms

class IfExpression {

    fun transform(param: Int): String {
        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "default"
        }

        return result
    }

}