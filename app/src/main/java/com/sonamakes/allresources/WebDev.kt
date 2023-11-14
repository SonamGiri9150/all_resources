//package com.sonamakes.allresources
//
//import com.sonamakes.allresources.Adapterres
//
//import android.content.Context
//import android.content.Intent
//import android.net.Uri
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
////
////import androidx.appcompat.app.AppCompatActivity
////import android.os.Bundle
////
////import androidx.recyclerview.widget.LinearLayoutManager
////import androidx.recyclerview.widget.RecyclerView
////import Adapterres
////import com.sonamakes.allresources.datavideo
//
//class WebDev : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Initialize RecyclerView
//        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        val layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
//
//        val videoDataList = fetchData() // Update this to fetch video names, URLs, and image resource IDs
//
//        val adapter =Adapterres(this, videoDataList)
//        recyclerView.adapter = adapter
//    }
//
//    private fun fetchData(): List<datavideo> {
//        val videoDataList = mutableListOf<datavideo>()
//        videoDataList.add(datavideo("Video 1", "https://www.youtube.com/watch?v=VIDEO_ID_1", R.drawable.bg))
//        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.bg))
//        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.bg))
//        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.bg))
//        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.bg))
//        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.bg))
//        // Add more video data as needed
//        return videoDataList
//    }
//}

package com.sonamakes.allresources

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sonamakes.allresources.Adapterres  // Import the Adapterres class

class WebDev : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val videoDataList = fetchData() // Update this to fetch video names, URLs, and image resource IDs

        val adapter = Adapterres(this, videoDataList)
        recyclerView.adapter = adapter
    }

    private fun fetchData(): List<datavideo> {
        val videoDataList = mutableListOf<datavideo>()
        videoDataList.add(datavideo("Video 1", "https://www.youtube.com/watch?v=VIDEO_ID_1", R.drawable.allrp))
        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.allrp))
        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.allrp))
        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.allrp))
        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.allrp))
        videoDataList.add(datavideo("Video 2", "https://www.youtube.com/watch?v=VIDEO_ID_2", R.drawable.allrp))
        // Add more video data as needed
        return videoDataList
    }
}