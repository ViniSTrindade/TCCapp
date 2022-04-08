package com.vinicius.myapplication.afienglishonly.fragments

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.vinicius.myapplication.R
import com.vinicius.myapplication.afienglishonly.MainActivity
import java.nio.file.Files.find


class FirstFragment : Fragment() {

    lateinit var botao01 : Button
    lateinit var textView: TextView
    lateinit var pegaTexto: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        var fragmentLayout = inflater.inflate(R.layout.fragment_first, container, false)

        botao01 = fragmentLayout.findViewById(R.id.btnVc06Id)
        textView = fragmentLayout.findViewById(R.id.mostraBotaoId)
        botao01.setOnClickListener {
            pegaTexto = botao01.getText().toString()
            textView.setText(pegaTexto)
        }


        return fragmentLayout
    }


}