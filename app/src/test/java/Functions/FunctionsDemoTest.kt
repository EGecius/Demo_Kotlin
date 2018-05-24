@file:Suppress("MemberVisibilityCanBePrivate")

package Functions

import org.junit.Before
import org.junit.Test

class FunctionsDemoTest {

    private var mSut: FunctionsDemo? = null

    @Before
    fun setUp() {
        mSut = FunctionsDemo()
    }

    fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
        qux()
    }

    fun execute() {
        println("hello 3")
    }

    fun execute(myLambda: () -> Unit) {
        myLambda()
    }

    @Test
    fun `demo passing lambdas to method`() {

        // alternative syntaxes of exactly same behaviour:

        execute { println("hello 3") }

        execute() { println("hello 3") }
        execute({ println("hello 3") })

    }


}