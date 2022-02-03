package com.example.studykotlin

import android.content.ClipData.newIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private lateinit var activityButton: Button

private const val REQUEST_CODE = 0

val dataClass = DataClass("Alexandra", "LastName")
val copy = dataClass.copy("Oleg")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<TextView>(R.id.data)
        val textCopy = findViewById<TextView>(R.id.data_copy)

        val button = findViewById<Button>(R.id.button_btn)
        button.setOnClickListener {
            Toast.makeText(this, "My Famaly name", Toast.LENGTH_SHORT).show()
            text1.text = dataClass.firstName + " " + dataClass.lastName
            textCopy.text = copy.firstName + " " + dataClass.lastName
        }

        activityButton = findViewById(R.id.activity_button)

        activityButton.setOnClickListener {
            // Start WeatherActivity

            val intent = WeatherActivity.newIntent(this@MainActivity, isTrue)
            startActivityForResult(intent, REQUEST_CODE)
        }
    }
}