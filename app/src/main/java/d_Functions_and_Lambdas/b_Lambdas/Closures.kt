package d_Functions_and_Lambdas.b_Lambdas

/** A lambda expression or anonymous function (as well as a local function and an object expression) can access its
closure, i.e. the variables declared in the outer scope. Unlike Java, the variables captured in the closure can be
modified:
 */
fun sumOfArray(ints: IntArray): Int {

    var sum = 0

    ints.filter { it > 0 }.forEach { sum += it }

    return sum
}