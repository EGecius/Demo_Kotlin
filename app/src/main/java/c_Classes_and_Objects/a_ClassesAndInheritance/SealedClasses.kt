package c_Classes_and_Objects.a_ClassesAndInheritance

/**
 * Sealed classes are, in a sense, an extension of enum classes: the set of values for an enum type is also restricted,
 * but
 * each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple
 * instances which can contain state
 *  */
class SealedClassUsage {


    /**
     * The key benefit of using sealed classes comes into play when you use them in a when expression. It will not
     * compile if you are not covering all cases or if you have no 'else' statement
     */
    fun eval(exp: Expr): Double = when (exp) {
        is Expr.Const -> exp.number
        is Expr.Sum -> eval(exp.e1) + eval(exp.e2)
        Expr.NotANumber -> Double.NaN
    }
}

sealed class Expr {

    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()

    object NotANumber : Expr()
}