package c_Classes_and_Objects.f_Data_Classes

internal class DestructuringDeclarations {

    fun destrucingDeclarations() {

        val jane = User("Jane", 35)
        //this gets values from generated componentN() methods
        val (name, age) = jane

        println("$name, $age years of age")
    }

}


data class User(val name: String, val age: Int)