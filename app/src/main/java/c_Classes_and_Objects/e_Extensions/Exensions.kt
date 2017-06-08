package c_Classes_and_Objects.e_Extensions

import android.app.Activity
import android.widget.Toast
import z_android.ParentType
import java.math.BigDecimal

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
/**
 * shows toast
 * @param duration by default set to Toast.LENGTH_SHORT
 */
fun Activity.showToast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun ParentType.doubleTheString(arg: String = "default") : String {
    return arg + arg
}


/* EXTENSION PROPERTIES */

/* here we are adding an extension property (like extension function) to class [Int]. It returns
BigDecimal passing Int as argument */

val Int.bigDecimal : BigDecimal
    get() = BigDecimal(this)