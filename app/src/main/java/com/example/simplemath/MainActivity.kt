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
        var num1 : EditText = findViewById<EditText>(R.id.et_input1)
        var num2 : EditText = findViewById<EditText>(R.id.et_input2)
        var result : TextView = findViewById<TextView>(R.id.tv_result)

        val btn_cong: Button = findViewById(R.id.btn_addition)
        btn_cong.setOnClickListener {
            if (checkNull(num1, num2)) {
                result.text = "Hãy nhập đủ 2 số"
                println("AAAAAAA")
            }else{
                val a: Double = num1.text.toString().toDouble()
                val b: Double = num2.text.toString().toDouble()
                val res = a + b
                result.text = res.toString()
            }
        }

        val btn_tru: Button = findViewById(R.id.btn_subtraction)
        btn_tru.setOnClickListener {
            if (checkNull(num1, num2)) {
                result.text = "Hãy nhập đủ 2 số"
            }else{
                val a: Double = num1.text.toString().toDouble()
                val b: Double = num2.text.toString().toDouble()
                val res = a - b
                result.text = res.toString()
            }
        }

        val btn_nhan: Button = findViewById(R.id.btn_multiply)
        btn_nhan.setOnClickListener {
            if (checkNull(num1, num2)) {
                result.text = "Hãy nhập đủ 2 số"
            }else{
                val a: Double = num1.text.toString().toDouble()
                val b: Double = num2.text.toString().toDouble()
                val res = a * b
                result.text = res.toString()
            }
        }

        val btn_chia: Button = findViewById(R.id.btn_division)
        btn_chia.setOnClickListener {
            if (checkNull(num1, num2)) {
                result.text = "Hãy nhập đủ 2 số"
            }else{
                val a: Double = num1.text.toString().toDouble()
                val b: Double = num2.text.toString().toDouble()
                val res = a / b
                result.text = res.toString()
            }
        }
    }

    fun checkNull (temp1 : EditText, temp2 : EditText) : Boolean {
        if (temp1.text.toString() == "" || temp2.text.toString() == ""){
            return true
        }
        return false
    }
}
