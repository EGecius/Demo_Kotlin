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

    fun labelForForEach(array: IntArray) {

        val arrayList = ArrayList<Int>()

        array.forEach {
            //again, this also returns from lambda, w/o stopping 'forEach' loop. It seems misleading got me since I
            // would get it would stop 'forEach' loop
            if (it == 3) return@forEach
            arrayList.add(it)
        }

        print(arrayList)
    }

}
