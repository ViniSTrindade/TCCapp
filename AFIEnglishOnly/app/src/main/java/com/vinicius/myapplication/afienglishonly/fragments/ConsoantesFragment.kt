package com.vinicius.myapplication.afienglishonly.fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.vinicius.myapplication.R
import kotlin.collections.ArrayList


class ConsoantesFragment : Fragment(), View.OnClickListener {
    private val TAG = "MyActivity"
    lateinit var textView: TextView
    lateinit var pegaTexto: String

    lateinit var btnCs1: Button
    lateinit var btnCs2: Button
    lateinit var btnCs3: Button

    lateinit var mp1: MediaPlayer
    lateinit var mp2: MediaPlayer
    lateinit var mp3: MediaPlayer

    private var player: MediaPlayer? = null
    val list: MutableList<MediaPlayer> = ArrayList()
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val vista = inflater.inflate(R.layout.fragment_consoantes, container, false)

        btnCs1 = vista.findViewById(R.id.btnCs1)
        btnCs2 = vista.findViewById(R.id.btnCs2)
        btnCs3 = vista.findViewById(R.id.btnCs3)



        textView = vista.findViewById(R.id.displayConsoantes)

        clickListeners()


        return vista
    }

    private fun clickListeners() {

        btnCs1.setOnClickListener(this)
        btnCs2.setOnClickListener(this)
        btnCs3.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnCs1 -> {
                list.add(MediaPlayer.create(context, R.raw.audio_vc3))
                list[0].start()
                pegaTexto = btnCs1.getText().toString()
                textView.setText(pegaTexto)
                Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
                    override fun run() {
                        btnCs1.isEnabled = false
                    }
                }, 5000)
            }

            R.id.btnCs2 -> {
                list.add(MediaPlayer.create(context, R.raw.audio_vc4))
                mp2 = list[1]
                mp2.start()
                pegaTexto = btnCs2.getText().toString()
                textView.setText(pegaTexto)
            }
            R.id.btnCs3 -> {
                list.add(MediaPlayer.create(context, R.raw.audio_vc7))
                mp3 = list[2]
                mp3.start()
                pegaTexto = btnCs3.getText().toString()
                textView.setText(pegaTexto)
            }
        }
    }

}

