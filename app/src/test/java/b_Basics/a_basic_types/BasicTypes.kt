package b_Basics.a_basic_types

class Characters {

    //Long with lowercase does not compile
    //    val myLong2: Long = 123l
    val myLong: Long = 123L

    //Float compiles both lowercase and uppercase
    val myFloat2: Float = 123.5f
    val myFloat: Float = 123.5F

    fun checkCharDoesNotCompareToIn(c: Char) {
//        if (c == 1) { // does not compiler
//
//        }
    }


}

class Comparisons {

    fun compareByReference(string1: String, string2: String) :Boolean {
        return string1 === string2
    }

    fun compareByEquality(string1: String, string2: String) :Boolean {
        return string1 == string2
    }
}