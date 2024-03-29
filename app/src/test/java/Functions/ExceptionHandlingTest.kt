package functions


import io.kotest.matchers.shouldBe
import org.junit.Test


class ExceptionHandlingTest {

    @Test
    fun `runCatching catches exceptions`() {
        val result: Result<Unit> = runCatching {
            throwMyException()
        }

        result shouldBe Result.failure(Exception("Egis"))

    }

    private fun throwMyException() {
        throw Exception("Egis")
    }
}
