package y_mocking

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

/**
 * Tests for [Container]
 */
@RunWith(MockitoJUnitRunner::class)
class ContainerTest2 {

    @Mock lateinit var dependency : Dependency

    lateinit var container : Container

    @Before fun setup() {
        container = Container(dependency)
    }

    @Test
    fun mockitoWorks() {
        //WHEN
        container.doTheThing()
        //THEN
        verify(dependency).alsoDoSomething()
    }

}