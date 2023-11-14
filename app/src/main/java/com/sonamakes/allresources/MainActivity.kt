package com.sonamakes.allresources

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frstpg=findViewById<Button>(R.id.ftos)

        frstpg.setOnClickListener {
            intent= Intent(applicationContext,domainnames::class.java)
            startActivity(intent)
        }
    }
}