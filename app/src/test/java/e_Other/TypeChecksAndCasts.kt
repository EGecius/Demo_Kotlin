package e_Other

import org.junit.Test

class TypeChecksAndCasts {

    @Test(expected = TypeCastException::class)
    fun `unsafe cast throws TypeCastException`() {
        val y = null
        val x: String = y as String
    }

    @Test
    fun `unsafe cast can accept null when '?' added`() {
        val y = null
        val x: String? = y as String?
    }

    @Test(expected = ClassCastException::class)
    fun `unsafe cast throws ClassCastException if types do not match`() {
        val y: Int = 1
        val x: String = y as String
    }

    @Test
    fun `safe (nullable) cast returns nulls if types do not match`() {
        val y: Int = 1
        val x: String? = y as? String
    }
}