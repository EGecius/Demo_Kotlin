package Functions

import android.app.Activity
import android.widget.Toast

/**
 * Shows how to use extension functions
 */
class ExtensionFunctions

/**
 * shows toast
 * @param duration by default set to Toast.LENGTH_SHORT
 */
fun Activity.showToast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
