package b_Basics.a_basic_types

class Characters {

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