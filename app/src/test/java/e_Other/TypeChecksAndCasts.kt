package e_Other

import org.junit.Test

class TypeChecksAndCasts{

    @Test (expected = TypeCastException::class)
    fun `unsafe cast throws TypeCastException`() {
        val y = null
        val x: String = y as String
    }
}