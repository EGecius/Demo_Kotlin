package b_Basics.c_ControlFlow

internal class IfExpressions {


    fun getMaxWithTraditionalUsage(a: Int, b: Int): Int {

        var max: Int
        if (a > b) {
            max = a
        } else {
            max = b
        }

        return max
    }

    fun getMaxAsExpression1(a: Int, b: Int): Int {

        val max = if (a > b) a else b

        return max
    }

    fun getMaxAsExpression2(a: Int, b: Int): Int {

        val max = if (a > b) {
            print((a))
            a
        } else {
            print(b)
            b
        }

        return max
    }
}
