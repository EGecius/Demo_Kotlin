package c_Classes_and_Objects.m_delegation

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DelegationUsageKtTest {

    interface Base {
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override fun print() { print(x) }
    }

    class Derived(b: Base) : Base by b

    @Test
    fun demoDelegation() {
        val b = BaseImpl(10)
        Derived(b).print()

        // will print '10
    }

}