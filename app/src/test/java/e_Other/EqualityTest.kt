package e_Other

import org.junit.Test

@Suppress("DEPRECATED_IDENTITY_EQUALS", "RedundantExplicitType")
class EqualityTest {
    
    @Test
    fun given__when__then_() {

        val a: Int = 1000
        println(a === a)

        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA)

        println(boxedA == anotherBoxedA)
    }
}