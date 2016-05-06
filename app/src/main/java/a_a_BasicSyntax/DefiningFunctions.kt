package a_a_BasicSyntax

internal class DefiningFunctions {

    /** Function having two Int parameters with Int return type */
    fun sum (a: Int, b: Int): Int {
        return a + b
    }

    /** Function with an expression body and inferred return type */
    fun sumInferredReturnType (a: Int, b: Int) = a + b

    /** Function returning no meaningful value */
    fun printSum(a: Int, b: Int) : Unit {
        print(a + b)
    }

    /** Same as above - Unit return type can be omitted:  */
    fun printSumWitoutDefinedReturnType(a: Int, b: Int) {
        print(a + b)
    }

}
