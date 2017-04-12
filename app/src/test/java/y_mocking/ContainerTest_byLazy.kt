package y_mocking

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

/**
 * Tests for [Container]
 */
@RunWith(MockitoJUnitRunner::class)
class ContainerTest_byLazy {

    @Mock lateinit var dependency: Dependency

    val container: Container by lazy { Container(dependency) }

    @Test
    fun mockitoWorks() {
        //WHEN
        container.doTheThing(4)
        //THEN
        verify(dependency).alsoDoSomething(4, any())
    }

}