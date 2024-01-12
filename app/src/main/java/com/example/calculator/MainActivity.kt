package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.calculator.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var num1:EditText
    lateinit var num2:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1=findViewById(R.id.num1)
        num2=findViewById(R.id.num2)



    }
    fun action(v:View){
        var answer=0.0
        val calculator=Calculator(
            num1.text.toString().toDouble(),
            num2.text.toString().toDouble()
        )

        when(v.id){
            R.id.add->{
                answer=calculator.add()
                val intent=Intent(this,Display::class.java)
                intent.putExtra("Ans",answer)
                startActivity(intent)
            }
            R.id.sub->{
                answer=calculator.sub()
                val intent=Intent(this,Display::class.java)
                intent.putExtra("Ans",answer)
                startActivity(intent)
            }
            R.id.multiply->{
                answer=calculator.multiply()
                val intent=Intent(this,Display::class.java)
                intent.putExtra("Ans",answer)
                startActivity(intent)
            }
            R.id.divide->{
                answer=calculator.divide()
                val intent=Intent(this,Display::class.java)
                intent.putExtra("Ans",answer)
                startActivity(intent)
            }
        }
    }
}