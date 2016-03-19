package a_a_BasicSyntax


internal class ConditionalExpressions {

    fun max(a: Int, b: Int) : Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    /** Uses 'if' as an expression */
    fun maxInferred(a: Int, b: Int) = if (a > b) a else b

}
