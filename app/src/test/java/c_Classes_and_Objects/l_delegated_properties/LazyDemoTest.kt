package c_Classes_and_Objects.l_delegated_properties

import org.junit.Before
import org.junit.Test

/**
 * Tests for [LazyDemo]
 */
class LazyDemoTest {

    internal lateinit  var demo: LazyDemo

    @Before
    fun setup() {
        demo = LazyDemo()
    }

    @Test
    fun when__then() {
        //WHEN

        //check initial value
        assert(demo.count == 0)

        //later, no matter how may times 'lazyVal' is accessed, lambda is executed only the first time
        // 'lazyVal' is accessed
        for (i in 0..9) {
            demo.lazyVal
            assert(demo.count == 1)
        }

    }

}