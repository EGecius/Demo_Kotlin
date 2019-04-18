package a_GettingStarted.a_BasicSyntax

import org.junit.Test

/**
 * Tests for [GenericFunctions]
 */
class GenericFunctionsTest {

    internal var classUnderTest: GenericFunctions = GenericFunctions()

    @Test
    fun ints() {
        //WHEN
        val listOfInts = classUnderTest.toList(1, 2)

        //THEN
        assert(listOfInts.size == 2)
        assert(listOfInts[0] == 1)
        assert(listOfInts[1] == 2)
    }

    @Test
    fun strings() {
        //WHEN
        val listOfStrings = classUnderTest.toList("one", "two")

        //THEN
        assert(listOfStrings.size == 2)
        assert(listOfStrings[0] == "one")
        assert(listOfStrings[1] == "two")
    }

    @Test
    fun `demo reified`() {

    	"myString".toObjectReified<MyData>()
        "myString".toObjectDefault(MyData::class)

    }

}

class MyData