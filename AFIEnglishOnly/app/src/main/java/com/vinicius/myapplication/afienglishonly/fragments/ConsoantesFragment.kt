package com.vinicius.myapplication.afienglishonly.fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.speech.tts.TextToSpeech
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.vinicius.myapplication.R
import java.util.*

class ConsoantesFragment : Fragment(), View.OnClickListener {
    private val TAG = "MyActivity"
    lateinit var textView: TextView
    lateinit var pegaTexto: String

    lateinit var btnCs1: Button
    lateinit var btnCs2: Button
    lateinit var btnCs3: Button
    lateinit var btnCs4: Button
    lateinit var btnCs5: Button
    lateinit var btnCs6: Button
    lateinit var btnCs7: Button
    lateinit var btnCs8: Button
    lateinit var btnCs9: Button
    lateinit var btnCs10: Button
    lateinit var btnCs11: Button
    lateinit var btnCs12: Button
    lateinit var btnCs13: Button
    lateinit var btnCs14: Button
    lateinit var btnCs15: Button

    lateinit var btnCm1: Button
    lateinit var btnCm2: Button
    lateinit var btnCm3: Button
    lateinit var btnCm4: Button
    lateinit var btnCm5: Button
    lateinit var btnCm6: Button
    lateinit var btnCm7: Button
    lateinit var btnCm8: Button
    lateinit var btnCm9: Button

    lateinit var tts: TextToSpeech

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
        btnCs4 = vista.findViewById(R.id.btnCs4)
        btnCs5 = vista.findViewById(R.id.btnCs5)
        btnCs6 = vista.findViewById(R.id.btnCs6)
        btnCs7 = vista.findViewById(R.id.btnCs7)
        btnCs8 = vista.findViewById(R.id.btnCs8)
        btnCs9 = vista.findViewById(R.id.btnCs9)
        btnCs10 = vista.findViewById(R.id.btnCs10)
        btnCs11 = vista.findViewById(R.id.btnCs11)
        btnCs12 = vista.findViewById(R.id.btnCs12)
        btnCs13 = vista.findViewById(R.id.btnCs13)
        btnCs14 = vista.findViewById(R.id.btnCs14)
        btnCs15 = vista.findViewById(R.id.btnCs15)

        btnCm1 = vista.findViewById(R.id.btnCm1)
        btnCm2 = vista.findViewById(R.id.btnCm2)
        btnCm3 = vista.findViewById(R.id.btnCm3)
        btnCm4 = vista.findViewById(R.id.btnCm4)
        btnCm5 = vista.findViewById(R.id.btnCm5)
        btnCm6 = vista.findViewById(R.id.btnCm6)
        btnCm7 = vista.findViewById(R.id.btnCm7)
        btnCm8 = vista.findViewById(R.id.btnCm8)
        btnCm9 = vista.findViewById(R.id.btnCm9)

        textView = vista.findViewById(R.id.displayConsoantes)

        clickListeners()

        return vista
    }

    private fun clickListeners() {

            btnCs1.setOnClickListener(this)
            btnCs2.setOnClickListener(this)
            btnCs3.setOnClickListener(this)
            btnCs4.setOnClickListener(this)
            btnCs5.setOnClickListener(this)
            btnCs6.setOnClickListener(this)
            btnCs7.setOnClickListener(this)
            btnCs8.setOnClickListener(this)
            btnCs9.setOnClickListener(this)
            btnCs10.setOnClickListener(this)
            btnCs11.setOnClickListener(this)
            btnCs12.setOnClickListener(this)
            btnCs13.setOnClickListener(this)
            btnCs14.setOnClickListener(this)
            btnCs15.setOnClickListener(this)

            btnCm1.setOnClickListener(this)
            btnCm2.setOnClickListener(this)
            btnCm3.setOnClickListener(this)
            btnCm4.setOnClickListener(this)
            btnCm5.setOnClickListener(this)
            btnCm6.setOnClickListener(this)
            btnCm7.setOnClickListener(this)
            btnCm8.setOnClickListener(this)
            btnCm9.setOnClickListener(this)
        }

    override fun onClick(v: View?) {

        when (v?.getId()) {
            R.id.btnCs1 -> {
                pegaTexto = btnCs1.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs2 -> {
                pegaTexto = btnCs2.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs3 -> {
                pegaTexto = btnCs3.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs4 -> {
                pegaTexto = btnCs4.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs5 -> {
                pegaTexto = btnCs5.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs6 -> {
                pegaTexto = btnCs6.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs7 -> {
                pegaTexto = btnCs7.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs8 -> {
                pegaTexto = btnCs8.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs9 -> {
                pegaTexto = btnCs9.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs10 -> {
                pegaTexto = btnCs10.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs11 -> {
                pegaTexto = btnCs11.getText().toString()
                textView.setText(pegaTexto)
            }
            R.id.btnCs12 -> {
                pegaTexto = btnCs12.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs13 -> {
                pegaTexto = btnCs13.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs14 -> {
                pegaTexto = btnCs14.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCs15 -> {
                pegaTexto = btnCs15.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }


            R.id.btnCm1 -> {
                pegaTexto = btnCm1.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm2 -> {
                pegaTexto = btnCm2.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm3 -> {
                pegaTexto = btnCm3.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm4 -> {
                pegaTexto = btnCm4.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm5 -> {
                pegaTexto = btnCm5.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm6 -> {
                pegaTexto = btnCm6.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm7 -> {
                pegaTexto = btnCm7.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm8 -> {
                pegaTexto = btnCm8.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
            R.id.btnCm9 -> {
                pegaTexto = btnCm9.getText().toString()
                textView.setText(pegaTexto)
                reproduzirFonema()
            }
        }
    }

    fun reproduzirFonema() {
        tts = TextToSpeech(this.context, TextToSpeech.OnInitListener {
            if (it == TextToSpeech.SUCCESS) {
                tts.language = Locale.US
                tts.setSpeechRate(1.0f)
                tts.speak(pegaTexto.toString(), TextToSpeech.QUEUE_ADD, null)
            }
        })
    }
}
