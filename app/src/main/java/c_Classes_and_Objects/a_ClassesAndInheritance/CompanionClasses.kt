package c_Classes_and_Objects.a_ClassesAndInheritance

/**
 * if you declare a companion object inside your class, you’ll be able to call its members with the same syntax as
 * calling static methods in Java/C#, using only the class name as a qualifier.
 */

class ClassWithCompanionObject {

   public  val name = "class_name"

    fun myMethod() {

    }


    companion object {
        fun accessInternals() : String {
            return name
        }
    }

}