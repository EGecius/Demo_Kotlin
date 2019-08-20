package z_android

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import c_Classes_and_Objects.e_Extensions.doubleTheString
import c_Classes_and_Objects.e_Extensions.showToast
import com.egecius.android.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val childType = ChildType("name")

        childType.doubleTheString()

        /* Support lambdas by default */
        findViewById<Button>(R.id.button).setOnClickListener {
            showToast("shown from extension function")
        }

    }
}
