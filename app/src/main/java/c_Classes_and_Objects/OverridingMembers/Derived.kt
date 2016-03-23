package c_Classes_and_Objects.OverridingMembers

open class Derived : Base() {

    /** as non-final function, it is till open to overriding */
    override fun openFunction() {
        super.openFunction()
    }

    /** As a final function, it can't be overriden */
    final override fun openFunction2() {
        super.openFunction2()
    }
}
