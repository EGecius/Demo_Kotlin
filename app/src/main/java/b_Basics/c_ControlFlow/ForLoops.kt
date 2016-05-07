package b_Basics.c_ControlFlow

internal class ForLoops {

    fun forWithoutBlock(collection: Collection<Int>) {

        for (element in collection)
            print(element)
    }

    fun funWithBlock(collection: Collection<Int>) {

        for (i in collection) {
            print(i)
        }
    }

    fun withIndices(array: IntArray) {

        for (i in array.indices) {
            //here 'i' become the index in the array
            print(i)
        }
    }

    fun withIndexAndValue(array: IntArray) {

        for ((index, value) in array.withIndex()) {
            print("the element at $index is $value \n")
        }
    }

}
