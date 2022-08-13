package com.example.pre_workproject

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChangeString.setOnClickListener{
            tvOutput.text = etName.text.toString()
        }
        btnChangeTextColor.setOnClickListener{
            tvOutput.setTextColor(Color.YELLOW)
        }
        btnChangeViewColor.setOnClickListener{
            mainView.setBackgroundColor(Color.LTGRAY)
        }
    }
}