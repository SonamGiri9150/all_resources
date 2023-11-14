package com.sonamakes.allresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Blockchain : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)


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