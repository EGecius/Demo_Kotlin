package c_Classes_and_Objects

import org.junit.Assert.*
import org.junit.Before

/**
 * Tests for [LateInitializedProperties]
 */
class LateInitializedPropertiesTest {


    /** it does nto compile without 'lateinit' */
    lateinit var classUnderTest: LateInitializedProperties

    @Before
    fun setup() {
        classUnderTest = LateInitializedProperties("my title")
    }



}