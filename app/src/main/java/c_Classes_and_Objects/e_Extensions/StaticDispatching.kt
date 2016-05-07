package c_Classes_and_Objects.e_Extensions

/**
 * extension functions are dispatched statically, i.e. they are not virtual by receiver type. This means that the
 * extension function being called is determined by the type of the expression on which the function is invoked, not
 * by the type of the result of evaluating that expression at runtime. For example   */
internal class StaticDispatching

open class C

class D : C()

fun C.foo() = "c"

fun D.foo() = "d"

/**
 * printFoo(D())
 * This example will print “c”, because the extension function being called depends only on the declared type of the
 * parameter c, which is the C class.
 */
fun printFoo(c: C) {
    println(c.foo())
}
