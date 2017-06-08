package d_Functions_and_Lambdas.b_Lambdas

/**
 * Shows how to pass lambdas to build a calculator
 */

fun add(x: Int, y: Int) = operation(x, y, sum)
fun deduct(x: Int, y: Int) = operation(x, y, deduct)
fun multiply(x: Int, y: Int) = operation(x, y, multiply)
fun divide(x: Int, y: Int) = operation(x, y, divide)

internal fun operation(x: Int, y: Int, operationLambda: (Int, Int) -> Int) = operationLambda(x, y)

val sum = { x: Int, y: Int -> x + y }

/* another way to declare lambda is by declaring its type*/
val deduct: (Int, Int) -> Int = { x, y -> x - y }

val multiply = { x: Int, y: Int -> x * y }
val divide = { x: Int, y: Int -> x / y }