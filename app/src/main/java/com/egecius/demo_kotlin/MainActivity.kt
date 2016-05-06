package com.egecius.demo_kotlin

import Functions.doubleTheString
import Functions.showToast
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.egecius.demo_kotlin.types.ChildType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val childType = ChildType("name")

        childType.doubleTheString()

        /* Support lambdas by default */
        findViewById(R.id.button).setOnClickListener {
            showToast("shown from extension function")
        }

    }
}
