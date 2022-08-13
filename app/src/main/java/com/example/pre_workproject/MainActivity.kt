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
            tvOutput.setTextColor(Color.BLUE)
        }
        btnChangeViewColor.setOnClickListener{
            mainView.setBackgroundColor(Color.LTGRAY)
        }
        mainView.setOnClickListener{
            tvOutput.text = "Hello from Amandeep!"
            tvOutput.setTextColor(Color.BLACK)
            mainView.setBackgroundColor(Color.WHITE)
            etName.setText("")


        }

    }
}