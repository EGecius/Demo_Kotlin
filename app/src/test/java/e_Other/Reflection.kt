@file:Suppress("UNUSED_VARIABLE", "MemberVisibilityCanBePrivate")

package e_Other

import c_Classes_and_Objects.a_ClassesAndInheritance.MyClass
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import kotlin.reflect.KProperty0

class Reflection {

    @Test
    fun `java class reference and kotlin class reference are different`() {

        val kotlinReference = MyClass::class
        val javaReference = kotlinReference.java

        assertThat(kotlinReference).isNotEqualTo(javaReference)
    }

    @Test
    fun `demo Function References`() {

        val numbers = listOf(1, 2, 3)
        val filtered = numbers.filter(::isOdd)

        assertThat(filtered).containsExactly(1, 3)
    }

    fun isOdd(x: Int) = x % 2 != 0

    @Test
    fun `demo Function Reference in another class`() {

        val stringToInt: (s: String) -> Int = String::toInt
        val strings = listOf("12", "13")

        val mappedToInts = strings.map(stringToInt)

        assertThat(mappedToInts).containsExactly(12, 13)
    }

    @Test
    fun `demo Function Composition`() {

        fun length(s: String) = s.length

        val oddLength = compose(::isOdd, ::length)
        val strings = listOf("a", "ab", "abc")

        println(strings.filter(oddLength))
    }

    fun <A, B, C> compose(fun1: (B) -> C,
                          fun2: (A) -> B)
            : (A) -> C {
        return { x: A -> fun1(fun2(x)) }
    }

    val x = 1

    @Test
    fun `demo property references`() {
        assertThat(::x.get()).isEqualTo(1)
        assertThat(::x.name).isEqualTo("x")

        val kProperty0: KProperty0<Int> = ::x
    }

}
