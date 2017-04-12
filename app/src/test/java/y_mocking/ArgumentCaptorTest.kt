package y_mocking

import com.nhaarman.mockito_kotlin.*
import org.junit.Test

/**
 * Tests for [Container]
 */
class ArgumentCaptorTest {

    val dependency: Dependency = mock()
    val captorDependencyCallback = argumentCaptor<Dependency.Callback>()

    var container = Container(dependency)

    @Test
    fun argumentCaptors() {
        //WHEN
        container.doTheThing(4)
        //THEN
        verify(dependency).alsoDoSomething(eq(4), captorDependencyCallback.capture())
    }

    @Test
    fun anyTests() {
        //WHEN
        container.doTheThing(4)
        //THEN
        verify(dependency).alsoDoSomething(eq(4), any())
    }

}