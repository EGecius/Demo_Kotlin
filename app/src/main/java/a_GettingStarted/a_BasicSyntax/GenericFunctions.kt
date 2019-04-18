package a_GettingStarted.a_BasicSyntax

import com.google.gson.Gson
import java.util.*
import kotlin.reflect.KClass

class GenericFunctions {

    fun <T> toList(vararg values: T): List<T> {
        val list = ArrayList<T>()
        for (v in values) {
            list.add(v)
        }
        return list
    }

//    fun <T> String.toObject(): T {
//        //does not compile!
//        return Gson().fromJson(this, T::class.java)
//    }

}

// same as above but inline & reified - here we can get class of T because at compile time
// the function is copied into the caller, so we know the actual type
inline fun <reified T: Any> String.toObjectReified(): T {
    return Gson().fromJson(this, T::class.java)
}

fun <T: Any> String.toObjectDefault(c: KClass<T>): T {
    return Gson().fromJson(this, c.java)
}