package a_GettingStarted.a_BasicSyntax

import java.util.*

class GenericFunctions {

    fun <T> toList(vararg values: T): List<T> {
        val list = ArrayList<T>()
        for (v in values) {
            list.add(v)
        }
        return list
    }
}