package com.example.exp3new

import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var etext: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        etext = findViewById(R.id.editTextExample)
        //val text: String = etext.text.toString()

        btn.setOnClickListener(){
            val text: String = etext.text.toString()
            val toast = Toast.makeText(this, "Hello $text", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}