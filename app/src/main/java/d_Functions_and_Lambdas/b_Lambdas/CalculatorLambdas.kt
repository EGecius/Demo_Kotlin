package d_Functions_and_Lambdas.b_Lambdas

/**
 * Shows hot to pass lambdas to build a calculator
 */

internal fun operation(x: Int, y: Int, operation: (Int, Int) -> Int) = operation(x, y)

fun add(x: Int, y: Int) = operation(x, y, sum)
fun deduct(x: Int, y: Int) = operation(x, y, deduct)
fun multiply(x: Int, y: Int) = operation(x, y, multiply)
fun divide(x: Int, y: Int) = operation(x, y, divide)


val sum = { x: Int, y: Int -> x + y }

/* another way to declare lambda is by declaring its type*/
val deduct: (Int, Int) -> Int = { x, y -> x - y }

val multiply = { x: Int, y: Int -> x * y }
val divide = { x: Int, y: Int -> x / y }