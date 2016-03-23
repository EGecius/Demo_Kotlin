package c_Classes_and_Objects.c_Interfaces.ResolvingOverridingConflicts

/**
 * This class needs to implement 'bar()' only because it has not been implemented by interface 'A'
 */
internal class C() : A {

    override fun bar() {
        print("bar")
    }

}
