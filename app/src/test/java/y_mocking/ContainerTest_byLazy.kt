package y_mocking

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
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
        container.doTheThing()
        //THEN
        verify(dependency).alsoDoSomething()
    }

}