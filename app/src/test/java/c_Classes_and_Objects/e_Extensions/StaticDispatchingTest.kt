package c_Classes_and_Objects.e_Extensions

import org.junit.Test

/**
 * Tests for [StaticDispatching]
 */
class StaticDispatchingTest {

    @Test
    fun staticDispatching() {
        // both will print 'c'
        printFoo(C())
        printFoo(D())
    }

}