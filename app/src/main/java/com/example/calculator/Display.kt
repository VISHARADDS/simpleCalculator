package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Display : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val back: Button =findViewById(R.id.back)
        back.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val tvAns:TextView=findViewById(R.id.tvAns)
        val intent=intent
       val ans= intent.getDoubleExtra("Ans",0.0)
        tvAns.text="The Anwser is $ans"


    }
}