package com.example.basic_1_usingxml

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var txt = findViewById<TextView>(R.id.txtHello)
//        txt.text = "안녕하세요"
//        txt.textSize = "32.0F"
//        txt.setTextColor(color.parseColor("#FF0000"))
        txtHello.text="안녕하세요"
        txtHello.textSize = 32.0F
//        txtHello.setTextColor("#ff0000")

        btn1.setOnClickListener(
            View.OnClickListener() {
                btn1.setText("Click~!!")
                btn1.setTextColor(Color.parseColor("#333333"))
                btn1.setBackgroundColor(Color.parseColor("#ffff33"))
            }
        )
        btn2.setOnClickListener {
            btn2.apply{
                text = "Click~!!"
                setTextColor(Color.parseColor("#333333"))
                setBackgroundColor(Color.parseColor("#ffff33"))
            }
        }
    }
}