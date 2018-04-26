package y_mocking

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.eq
import com.nhaarman.mockito_kotlin.verify
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ContainerTest_InjectMocks {

    @Mock
    lateinit var dependency: Dependency
    @InjectMocks
    lateinit var container: Container

    @Test
    fun mockitoWorks() {
        container.doTheThing(4)

        verify(dependency).alsoDoSomething(eq(4), any())
    }

}