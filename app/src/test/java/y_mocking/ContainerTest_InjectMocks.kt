package y_mocking

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

/**
 * Tests for [Container]
 */
@RunWith(MockitoJUnitRunner::class)
class ContainerTest_InjectMocks {

    @Mock lateinit var dependency : Dependency

    @InjectMocks lateinit var container : Container

    @Test
    fun mockitoWorks() {
        //WHEN
        container.doTheThing()
        //THEN
        verify(dependency).alsoDoSomething()
    }

}