package com.example.intent_calc_web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonintent:Button
    lateinit var Buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_calc)
        Buttonintent=findViewById(R.id.Btn_intent)
        Buttonweb=findViewById(R.id.Btn_web)

        Buttoncalc.setOnClickListener {
            val calc=Intent(this,CalculatorActivity::class.java)
            startActivity(calc)
        }
        Buttonintent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
    }
}