@file:Suppress("UNUSED_VARIABLE")

package e_Other

import c_Classes_and_Objects.a_ClassesAndInheritance.MyClass
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Reflection {

    @Test
    fun `java class reference and kotlin class reference are different`() {

        val kotlinReference = MyClass::class
        val javaReference = kotlinReference.java

        assertThat(kotlinReference).isNotEqualTo(javaReference)
    }

    @Test
    fun `demo Function References`() {

        fun isOdd(x: Int) = x % 2 != 0

        val numbers = listOf(1, 2, 3)
        val filtered = numbers.filter(::isOdd)

        assertThat(filtered).containsExactly(1, 3)
    }

}
