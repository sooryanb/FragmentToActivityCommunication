package com.example.fragmenttoactivitycommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.frameContainer, fragmentA).commit()

    }

    override fun passData(editTextData: String) {
        val textView = findViewById<TextView>(R.id.activityTextView)
        textView.text = editTextData
    }

}