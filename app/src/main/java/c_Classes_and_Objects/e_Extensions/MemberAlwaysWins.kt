package c_Classes_and_Objects.e_Extensions

/**
 * If a class has a member function, and an extension function is defined which has the same receiver type, the same
 * name and is applicable to given arguments, the member always wins
 */
class F {
    fun foo() { println("member") }
}

fun F.foo() { println("extension") }

