package com.example.studykotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

var isTrue = false

private const val EXTRA_IS_TRUE = "study_kotlin"

val dataWeather = DataWeather("Moscow", -7)
val copyWeather = dataWeather.copy("Vladimir", -8)

class WeatherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        isTrue = intent.getBooleanExtra(EXTRA_IS_TRUE, false)

        val firstCity = findViewById<TextView>(R.id.first_town)
        val secondCity = findViewById<TextView>(R.id.second_town)

        val buttonWeather = findViewById<Button>(R.id.weather_btn)
        buttonWeather.setOnClickListener {
            Toast.makeText(this, "Wether", Toast.LENGTH_SHORT).show()
            firstCity.text = dataWeather.town + " " + dataWeather.temperature
            secondCity.text = copyWeather.town + " " + copyWeather.temperature
        }


    }
    companion object {
        fun newIntent(packageContext: Context, isTrue: Boolean): Intent {
            return Intent(packageContext, WeatherActivity::class.java).apply {
                putExtra(EXTRA_IS_TRUE, isTrue)
            }
        }
    }

}