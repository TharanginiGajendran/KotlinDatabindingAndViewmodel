package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding

/**
 * Find view by id -> every time we use findViewById() function to get reference to the view,
 * Android system should go through view hierarchy and find it at runtime
 * when we have many layouts in large application, it is not good idea to go through the view hierarchy every time
 * so we use data binding
 * 1.when we use data binding we use binding object to reference to the view of the layout
 * 2.once the binding object is created, all the components of the app can access the views and this we cannot
 * go through view hierarchy again and again
 *
 * Data binding
 * 1. Improves the performance of the app
 * 2.Data binding object is created at compile time, so if there is any error can easily see and fix it
 *
 * step 1: Enable Data binding in build gradle app
 * step 2: databinding {
 * enabled = true
 * }
 */

/**
 * In order to generate binding class for xml layout => need to wrap layout with layout tags
 * Layout tag is activity_main using that,
 * android data binding library will create binding object ActivityMainBinding
 *Construct databinding object in the activity
 */


class MainActivity : AppCompatActivity() {
//    construct data binding object in the class
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.submitBtn.setOnClickListener { greetings() }
    }


    private fun greetings(){
        binding.apply {
            tvWelcomeText.text = etName.text.toString()
        }
    }
}