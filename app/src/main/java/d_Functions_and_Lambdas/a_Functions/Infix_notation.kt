package d_Functions_and_Lambdas.a_Functions

//define extension to nt
infix fun Int.egis(x: Int): Int {
    return 3
}

fun useInfixFunction() {
    // call extension function using infix notation
    1 egis  2

    // is the same as
    1.egis(2)

}