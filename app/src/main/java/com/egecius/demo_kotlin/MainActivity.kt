package com.egecius.demo_kotlin

import Functions.baseFunction
import Functions.showToast
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.egecius.demo_kotlin.types.ChildType

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast("shown from extension function")

        val childType = ChildType("name")

        childType.baseFunction()
    }
}
