package c_Classes_and_Objects.OverridingRules

class C() : A(), B {

    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}
