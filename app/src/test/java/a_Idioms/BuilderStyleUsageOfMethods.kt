package a_Idioms

class BuilderStyleUsageOfMethods {

    /** Initializes array to '-1' values */
    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }

}
