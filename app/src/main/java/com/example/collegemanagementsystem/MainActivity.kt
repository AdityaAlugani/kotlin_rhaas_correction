 package com.example.collegemanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.collegemanagementsystem.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }
     private fun setListeners()
     {
         binding.onlineclasses.setOnClickListener {
             startActivity(Intent(this,BranchActivity::class.java))
         }
         binding.courses.setOnClickListener {
             startActivity(Intent(this,BranchActivity::class.java))
         }
         binding.branches.setOnClickListener {
             startActivity(Intent(this,BranchActivity::class.java))
         }
         binding.aboutus.setOnClickListener {
             startActivity(Intent(this,BranchActivity::class.java))
         }




     }


}