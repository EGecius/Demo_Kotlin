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

}
