package c_Classes_and_Objects.f_Data_Classes

import org.junit.Test

data class User(val name: String, val age: Int)

class DestructuringDeclarationsTest {

    @Test
    fun when__then() {
        //prints expected
        val jane = User("Jane", 35)
        val (name, age) = jane
        println("$name, $age years of age")
    }

}