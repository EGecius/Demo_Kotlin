package d_Functions_and_Lambdas.a_Functions

//define extension to nt
infix fun Int.plus(addition: Int): Int {
    return this + addition
}

fun useInfixFunction() {
    // call extension function using infix notation
    1 plus 2

    // is the same as
    1.plus(2)

}