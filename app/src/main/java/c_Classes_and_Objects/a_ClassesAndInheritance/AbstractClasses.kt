package c_Classes_and_Objects.a_ClassesAndInheritance

open class Base() {
    open fun myFunction() {
    }
}

abstract class Derived : Base() {

    /// you can override an implemented open function and make it abstract
    override abstract fun myFunction()
}
