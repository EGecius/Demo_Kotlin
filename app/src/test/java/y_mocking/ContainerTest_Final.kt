package y_mocking

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.eq
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

/**
 * In order for this to work, rename file in test/resources/mockito-extensions from
 * 'MockMakerToRename' to 'org.mockito
 * .plugins.MockMaker'. However, this slows down running of unit tests by about 5 seconds
 *
 * Shows how even mocking of a final class 'DependencyImpl' is possible with MockMaker, which was
 * added to in Mockito 2
 */
@RunWith(MockitoJUnitRunner::class)
class ContainerTest_Final {

    @Mock lateinit var dependency : DependencyImpl
    @Mock lateinit var dataObject : DataObject

    lateinit var container : Container

    @Before fun setup() {
        container = Container(dependency)
    }

    @Test
    fun mockingSimpleFinalClassWorks() {
        //WHEN
        container.doTheThing(4)
        //THEN
        verify(dependency).alsoDoSomething(eq(4), any())
    }

    @Test
    fun mockingDataClassWorks() {
        //WHEN
        container.takeDataObject(dataObject)
        //THEN
        verify(dependency).alsoDoSomething(eq(dataObject), any())
    }

}