package b_Basics.d_ReturnsAndJumps

import org.junit.Test

class ReturnsTest {

    @Test
    fun `show how return statement can be used as part of expression`() {

        val person = Person(null)

        val name = person.name ?: return

        throw RuntimeException()
    }

    @Test (expected = RuntimeException::class)
    fun `return statement won't be executed if condition not met`() {

        val person = Person("pete")

        val name = person.name ?: return

        throw RuntimeException()
    }
}

class Person (var name: String?)