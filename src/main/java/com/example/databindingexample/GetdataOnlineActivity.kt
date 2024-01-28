package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityGetdataOnlineBinding

class GetdataOnlineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetdataOnlineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_getdata_online)

        /**
         * Lets see how to send this student object directly to the layout rather than sending it to the views
         * of the layout(which is activity binding here)
         */

        /**
         * Inside the data tag we have created object reference variable using variable tag
         */

        val person1 = Person("Tharangini","Gajendran","tharanginig1998@gmail.com")

        binding.person = person1


    }
}