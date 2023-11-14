package com.sonamakes.allresources

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.sonamakes.allresources.R
import com.sonamakes.allresources.datavideo

//import android.content.Context
//import android.content.Intent
//import android.net.Uri
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import androidx.recyclerview.widget.RecyclerView
//import com.sonamakes.allresources.R
//import com.sonamakes.allresources.datavideo


//class Adapterres(val context: Context, val videoDataList: List<datavideo>) : RecyclerView.Adapter<Adapterres.resviewholder>() {
//
//    override fun getItemCount(): Int {
//        return videoDataList.size
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): resviewholder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.wdlist, parent, false)
//        return resviewholder(view)
//    }
//
//    override fun onBindViewHolder(holder: resviewholder, position: Int) {
//        val videoData = videoDataList[position]
//        holder.imageView.setImageResource(videoData.imageResourceId)
//
//        holder.imageView.setOnClickListener {
//            openYouTubeVideo(videoData.url)
//        }
//    }
//
//    private fun openYouTubeVideo(videoUrl: String) {
//        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
//        context.startActivity(intent)
//    }
//
//    class resviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageView) // Update the view ID here
//    }
//}



class Adapterres(val context: Context, val videoDataList: List<datavideo>) : RecyclerView.Adapter<Adapterres.resviewholder>() {

    override fun getItemCount(): Int {
        return videoDataList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): resviewholder {
        val view = LayoutInflater.from(context).inflate(R.layout.wdlist, parent, false)
        return resviewholder(view)
    }

    override fun onBindViewHolder(holder: resviewholder, position: Int) {
        val videoData = videoDataList[position]

        // Bind data to the views in your layout
        holder.imageView.setImageResource(videoData.imageResourceId)


        holder.imageView.setOnClickListener {
            openYouTubeVideo(videoData.url)
        }
    }

    private fun openYouTubeVideo(videoUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl))
        context.startActivity(intent)
    }

    class resviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)

    }
}
