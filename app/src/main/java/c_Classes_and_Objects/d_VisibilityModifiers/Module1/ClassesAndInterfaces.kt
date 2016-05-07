package c_Classes_and_Objects.d_VisibilityModifiers.Module1

open class Outer {
    private val valPrivate = 1
    protected val valProtected = 2
    internal val valInternal = 3
    val valPublic = 4  // public by default

    open protected class ProtectedNested {
        public val e: Int = 5
    }

    open private class PrivateNested
}

class Subclass : Outer() {

    fun accessMembersOfParent() {

        // accessing private does not compile
        // val valueInternal = valPrivate
        valProtected
        valInternal
        valPublic
    }

    // Nested and e are visible
    protected class ExtendedProtectedNested : ProtectedNested() {
    }

    //Nested private not visible
    //    private class Extended : PrivateNested() {}

}

class Unrelated(val outer: Outer) {

    fun accessMembersOfUnrelated() {
        // private & protected values are not visible
        // outer.valPrivate
        // outer.valProtected
        outer.valInternal
        outer.valPublic
    }

    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}
