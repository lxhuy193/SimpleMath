package com.example.simplemath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var btn_temp : Button = findViewById(R.id.btn_addition)

        when (findViewById<Button>(R.id.btn_addition).text.toString()){
            "+" -> {
                val btn_cong : Button = findViewById(R.id.btn_addition)
                btn_cong.setOnClickListener {
                    var num1 : Double = (findViewById<EditText>(R.id.et_input1).text.toString()).toDouble()
                    var num2 : Double = (findViewById<EditText>(R.id.et_input2).text.toString()).toDouble()
                    var result = num1 + num2
                    findViewById<TextView>(R.id.tv_result).text = result.toString()
                }
            }

            "-" -> {
                val btn_tru : Button = findViewById(R.id.btn_subtraction)
                btn_tru.setOnClickListener {
                    var num1 : Double = (findViewById<EditText>(R.id.et_input1).text.toString()).toDouble()
                    var num2 : Double = (findViewById<EditText>(R.id.et_input2).text.toString()).toDouble()
                    var result = num1 - num2
                    findViewById<TextView>(R.id.tv_result).text = result.toString()
                }
            }

            "*" -> {
                val btn_nhan : Button = findViewById(R.id.btn_multiply)
                btn_nhan.setOnClickListener {
                    var num1 : Double = (findViewById<EditText>(R.id.et_input1).text.toString()).toDouble()
                    var num2 : Double = (findViewById<EditText>(R.id.et_input2).text.toString()).toDouble()
                    var result = num1 * num2
                    findViewById<TextView>(R.id.tv_result).text = result.toString()
                }
            }

            "/" -> {
                val btn_chia : Button = findViewById(R.id.btn_division)
                btn_chia.setOnClickListener {
                    var num1 : Double = (findViewById<EditText>(R.id.et_input1).text.toString()).toDouble()
                    var num2 : Double = (findViewById<EditText>(R.id.et_input2).text.toString()).toDouble()
                    var result = num1/num2
                    findViewById<TextView>(R.id.tv_result).text = result.toString()
                }
            }
        }
    }
}