package com.example.collegemanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.collegemanagementsystem.databinding.ActivityBranchBinding

class BranchActivity : AppCompatActivity() {
    lateinit var binding:ActivityBranchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBranchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }
    private fun setListeners()
    {
        binding.cse.setOnClickListener {
            startActivity(Intent(this,OnlineClassLinks::class.java))
        }
        binding.IT.setOnClickListener {
            startActivity(Intent(this,OnlineClassLinks::class.java))
        }
        binding.ece.setOnClickListener {
            startActivity(Intent(this,OnlineClassLinks::class.java))
        }
        binding.other.setOnClickListener {
            startActivity(Intent(this,OnlineClassLinks::class.java))
        }
    }
}