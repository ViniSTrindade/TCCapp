package com.vinicius.soundlist

import android.graphics.drawable.ClipDrawable.HORIZONTAL
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    var mediaPlayer: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.raw.audio_vc3,
            R.raw.audio_vc4,
            R.raw.audio_vc5,
            R.drawable.a,
            R.drawable.b,
            R.drawable.a,
            R.drawable.b
        )
        heading = arrayOf(
            "", "", "", "", "", "", ""
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = GridLayoutManager(this, 6)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val news = News(imageId[i], heading[i])
            newArrayList.add(news)
        }

        var adapter = MyAdapter(newArrayList)
        newRecyclerView.adapter = adapter

        adapter.setOnItemclickListner(object : MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                super.onItemClick(position)
                Toast.makeText(this@MainActivity,
                    "You clicked on item no. $position",
                    Toast.LENGTH_SHORT).show()
                mediaPlayer = MediaPlayer.create(this@MainActivity, imageId[position])
                mediaPlayer?.start()
            }
        })
    }
}
    /*private fun playAudio(){
        val audio = ""
        mediaPlayer = MediaPlayer()
        mediaPlayer!!.setAudioStreamType(Audio)
    }*/
