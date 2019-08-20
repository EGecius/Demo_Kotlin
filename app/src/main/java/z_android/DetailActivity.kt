package z_android

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.egecius.android.R
import java.io.Serializable

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
    }

    companion object {
        fun openFrom(originActivity: Activity, extra: Serializable) {
            val intent = Intent(originActivity, DetailActivity::class.java)
            originActivity.startActivity(intent)
        }
    }
}
