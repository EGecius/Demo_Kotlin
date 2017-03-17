package y_mocking

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

/**
 * Tests for [Container]
 */
@RunWith(MockitoJUnitRunner::class)
class ContainerTest {

    val dependency = mock(Dependency::class.java)

    var container = Container(dependency)

    @Test
    fun mockitoWorks() {
        //WHEN
        container.doTheThing()
        //THEN
        verify(dependency).alsoDoSomething()
    }

}