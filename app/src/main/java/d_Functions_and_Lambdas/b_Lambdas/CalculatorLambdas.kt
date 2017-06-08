package d_Functions_and_Lambdas.b_Lambdas

/**
 * Shows how to pass lambdas to build a calculator
 */

fun add(x: Int, y: Int) = operation(x, y, sum)

fun deduct(x: Int, y: Int) = operation(x, y, deduct)
fun multiply(x: Int, y: Int) = operation(x, y, multiply)
fun divide(x: Int, y: Int) = operation(x, y, divide)

/* alternatively you can declare lambdas within params parentheses: */
fun divideAlternative1(x: Int, y: Int) = operation(x, y, { x, y -> x / y })

/* or you can declare lambda outside parentheses: */
fun divideAlternative2(x: Int, y: Int) = operation(x, y) { x, y -> x / y }

/* or even on the next line, which makes it look as if you are declaring function 'operation'
here
 2 main differences to look for not to get confused with function declaration:
 1) function names is in italic
 2) function name is within a function
 */
fun divideAlternative3(x: Int, y: Int) = operation(x, y) {
    x, y ->
    x / y
}

internal fun operation(x: Int, y: Int, operationLambda: (Int, Int) -> Int) = operationLambda(x, y)

val sum = { x: Int, y: Int -> x + y }

/* another way to declare lambda is by declaring its type*/
val deduct: (Int, Int) -> Int = { x, y -> x - y }

val multiply = { x: Int, y: Int -> x * y }
val divide = { x: Int, y: Int -> x / y }