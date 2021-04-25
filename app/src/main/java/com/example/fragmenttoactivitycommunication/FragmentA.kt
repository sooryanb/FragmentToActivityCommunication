package com.example.fragmenttoactivitycommunication

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_a, container, false)

        val input = view.findViewById<EditText>(R.id.etInput)
        val btnSend = view.findViewById<Button>(R.id.btnSend)

        val context = context as MainActivity

        btnSend.setOnClickListener {
            val data = input.text.toString()
            context.passData(data)
        }

        return view
    }


}