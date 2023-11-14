package com.sonamakes.allresources

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class domainnames : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domainnames)

        val crd1=findViewById<CardView>(R.id.appd)
        val crd2=findViewById<CardView>(R.id.webd)
        val crd3=findViewById<CardView>(R.id.dsa)
        val crd4=findViewById<CardView>(R.id.blck)
        val crd5=findViewById<CardView>(R.id.uix)
        val crd6=findViewById<CardView>(R.id.cloudc)
        val cb=findViewById<Button>(R.id.callb)

        cb.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "9910486031")
            startActivity(dialIntent)
        }
        crd1.setOnClickListener {
            intent= Intent(applicationContext,AppDev::class.java)
            startActivity(intent)
        }
        crd2.setOnClickListener {
            intent=Intent(applicationContext,WebDev::class.java)
            startActivity(intent)
        }
        crd3.setOnClickListener {
            intent=Intent(applicationContext,DSA::class.java)
            startActivity(intent)
        }
        crd4.setOnClickListener {
            intent=Intent(applicationContext,Blockchain::class.java)
            startActivity(intent)
        }
        crd5.setOnClickListener {
            intent=Intent(applicationContext,UIUX::class.java)
            startActivity(intent)
        }

    }
}