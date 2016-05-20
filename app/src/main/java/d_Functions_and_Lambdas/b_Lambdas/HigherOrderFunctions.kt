package d_Functions_and_Lambdas.b_Lambdas

fun transformWithHigherOrderFunction(number: Int, body: (Int) -> String): String {
    return body(number)
}