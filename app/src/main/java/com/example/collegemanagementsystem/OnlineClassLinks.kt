package com.example.collegemanagementsystem

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.collegemanagementsystem.databinding.ActivityOnlineClassLinksBinding

class OnlineClassLinks : AppCompatActivity() {
    lateinit var binding:ActivityOnlineClassLinksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOnlineClassLinksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val classesList=ArrayList<String>()
        classesList.add("Computer Organization")
        classesList.add("Signals and systems")
        classesList.add("Mathematics")
        classesList.add("DBMS")
        classesList.add("Finance and accounting")
        classesList.add("ETC")
        classesList.add("Java")
        classesList.add("DAA")
        val adapter=ArrayAdapter(this,R.layout.listitems,classesList)
        binding.onlinelistview.adapter=adapter

        binding.onlinelistview.setOnItemClickListener { parent, view, position, id ->
            if(position==0)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }
            if(position==1)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }


            if(position==2)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }
            if(position==3)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }
            if(position==4)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }
            if(position==5)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }
            if(position==6)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }
            if(position==7)
            {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://apps.google.com/meet/")))
            }

        }
    }

}