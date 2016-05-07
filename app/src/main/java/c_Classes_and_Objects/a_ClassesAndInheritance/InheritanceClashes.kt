package c_Classes_and_Objects.a_ClassesAndInheritance


class InheritanceClashes : MyClass(), MyInterface {

    //must override f() because both parents have same function
    override fun f() {
        super<MyClass>.f()
        super<MyInterface>.f()
    }

}


open class MyClass {

    open fun f() {
        print("MyClass.f() \n")
    }

    fun a() {
        print("MyClass.a() \n")
    }

}

interface MyInterface {
    fun f() {
        print("MyInterface.f() \n")
    }

    fun b() {
        print("MyInterface.b() \n")
    }
}
