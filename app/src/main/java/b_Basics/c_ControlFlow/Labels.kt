package b_Basics.c_ControlFlow

import java.util.*

internal class Labels {

    fun labelForLambda(array: IntArray): ArrayList<Int> {

        val arrayList = ArrayList<Int>()

        array.forEach lit@ {
            //this labeled return tells to return from lambda expression, but does not stop forEach loop
            if (it == 3) return@lit
            arrayList.add(it)
        }

        return arrayList
    }

}
