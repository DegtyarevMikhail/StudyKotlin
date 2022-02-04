package com.example.studykotlin

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


private lateinit var gotoMain: Button
private const val LAST_CODE = 0


var newTrue = false

private const val EXTRA_NEW_TRUE = "loop_to_main_class"

//private val display: EditText? = null

class LoopActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loop)


        val gotoMain = findViewById<Button>(R.id.go_to_main)
        gotoMain.setOnClickListener{
            val intent = MainActivity.lastIntent(this@LoopActivity, fromLoopActivity)
            startActivityForResult(intent, LAST_CODE)
        }

        val display =findViewById<EditText>(R.id.go_to_loop)

        newTrue = intent.getBooleanExtra(EXTRA_NEW_TRUE, false)
        if(true.also { newTrue = it }){
                Toast.makeText(this, "This is LoopActivity", Toast.LENGTH_SHORT).show()
        }

    }



    companion object {
        fun loopIntent(packageContext: Context, isTrue: Boolean): Intent {
            return Intent(packageContext, LoopActivity::class.java).apply {
                putExtra(EXTRA_NEW_TRUE, newTrue)
            }
        }
    }
}