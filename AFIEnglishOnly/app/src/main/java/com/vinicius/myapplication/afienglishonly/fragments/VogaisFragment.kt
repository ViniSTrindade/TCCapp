package com.vinicius.myapplication.afienglishonly.fragments

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SeekBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.vinicius.myapplication.R
import kotlin.time.Duration.Companion.seconds


class VogaisFragment : Fragment() {
    private val TAG = "MyActivity"
//    lateinit var textView: TextView
    lateinit var pegaTexto: String

    lateinit var btnVc1: Button
    lateinit var btnVc2: Button
    lateinit var btnVc3: Button
    lateinit var btnVc4: Button
    lateinit var btnVc5: Button
    lateinit var btnVc6: Button
    lateinit var btnVc7: Button

    lateinit var btnVl1: Button
    lateinit var btnVl2: Button
    lateinit var btnVl3: Button
    lateinit var btnVl4: Button
    lateinit var btnVl5: Button

    lateinit var btnDt1: Button
    lateinit var btnDt2: Button
    lateinit var btnDt3: Button
    lateinit var btnDt4: Button
    lateinit var btnDt5: Button
    lateinit var btnDt6: Button
    lateinit var btnDt7: Button
    lateinit var btnDt8: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val vista = inflater.inflate(R.layout.fragment_vogais, container, false)

        btnVc1 = vista.findViewById(R.id.btnVc1)
        btnVc2 = vista.findViewById(R.id.btnVc2)
        btnVc3 = vista.findViewById(R.id.btnVc3)
        btnVc4 = vista.findViewById(R.id.btnVc4)
        btnVc5 = vista.findViewById(R.id.btnVc5)
        btnVc6 = vista.findViewById(R.id.btnVc6)
        btnVc7 = vista.findViewById(R.id.btnVc7)

        btnVl1 = vista.findViewById(R.id.btnVl1)
        btnVl2 = vista.findViewById(R.id.btnVl2)
        btnVl3 = vista.findViewById(R.id.btnVl3)
        btnVl4 = vista.findViewById(R.id.btnVl4)
        btnVl5 = vista.findViewById(R.id.btnVl5)

        btnDt1 = vista.findViewById(R.id.btnDt1)
        btnDt2 = vista.findViewById(R.id.btnDt2)
        btnDt3 = vista.findViewById(R.id.btnDt3)
        btnDt4 = vista.findViewById(R.id.btnDt4)
        btnDt5 = vista.findViewById(R.id.btnDt5)
        btnDt6 = vista.findViewById(R.id.btnDt6)
        btnDt7 = vista.findViewById(R.id.btnDt7)
        btnDt8 = vista.findViewById(R.id.btnDt8)

//        textView = vista.findViewById(R.id.displayVogais)

        return vista
    }

    /*    private fun clickListeners()
    {
        btnVc1.setOnClickListener(this)
        btnVc2.setOnClickListener(this)
        btnVc3.setOnClickListener(this)
        btnVc4.setOnClickListener(this)
        btnVc5.setOnClickListener(this)
        btnVc6.setOnClickListener(this)
        btnVc7.setOnClickListener(this)

        btnVl1.setOnClickListener(this)
        btnVl2.setOnClickListener(this)
        btnVl3.setOnClickListener(this)
        btnVl4.setOnClickListener(this)
        btnVl5.setOnClickListener(this)

        btnDt1.setOnClickListener(this)
        btnDt2.setOnClickListener(this)
        btnDt3.setOnClickListener(this)
        btnDt4.setOnClickListener(this)
        btnDt5.setOnClickListener(this)
        btnDt6.setOnClickListener(this)
        btnDt7.setOnClickListener(this)
        btnDt8.setOnClickListener(this)
    }*/

    /*override fun onClick(v: View?) {

        when (v?.getId()) {
            R.id.btnVc1 -> {
                pegaTexto = btnVc1.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVc2 -> {
                pegaTexto = btnVc2.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVc3 -> {
                pegaTexto = btnVc3.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVc4 -> {
                pegaTexto = btnVc4.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVc5 -> {
                pegaTexto = btnVc5.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVc6 -> {
                pegaTexto = btnVc6.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVc7 -> {
                pegaTexto = btnVc7.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }


            R.id.btnVl1 -> {
                pegaTexto = btnVl1.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVl2 -> {
                pegaTexto = btnVl2.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVl3 -> {
                pegaTexto = btnVl3.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVl4 -> {
                pegaTexto = btnVl4.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnVl5 -> {
                pegaTexto = btnVl5.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }


            R.id.btnDt1 -> {
                pegaTexto = btnDt1.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt2 -> {
                pegaTexto = btnDt2.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt3 -> {
                pegaTexto = btnDt3.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt4 -> {
                pegaTexto = btnDt4.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt5 -> {
                pegaTexto = btnDt5.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt6 -> {
                pegaTexto = btnDt6.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt7 -> {
                pegaTexto = btnDt7.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnDt8 -> {
                pegaTexto = btnDt8.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
        }*/

}