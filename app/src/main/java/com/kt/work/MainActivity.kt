package com.kt.work

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var test = Test()
//        var q:String = test.data



        var b: String ?="111"
        b=null
        val l = b!!.length

    }
}
