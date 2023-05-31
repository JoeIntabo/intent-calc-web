package com.example.intent_calc_web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Txtanswer:TextView
    lateinit var editfirstnumber:EditText
    lateinit var editsecondnumber:EditText
    lateinit var Buttonadd:Button
    lateinit var Buttonsubtract:Button
    lateinit var Buttonmultiply:Button
    lateinit var Buttondivide:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Txtanswer=findViewById(R.id.Tvanwerhere)
        editfirstnumber=findViewById(R.id.edt_fnum)
        editsecondnumber=findViewById(R.id.edt_snum)
        Buttonadd=findViewById(R.id.Btn_add)
        Buttonsubtract=findViewById(R.id.Btn_subtract)
        Buttonmultiply=findViewById(R.id.Btn_multiply)
        Buttondivide=findViewById(R.id.Btn_division)


        Buttonadd.setOnClickListener {
            val firstnum=editfirstnumber.text.toString()
            val secondnum=editsecondnumber.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()){
                Txtanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()+secondnum.toDouble()
                Txtanswer.text=answer.toString()
            }
        }
        Buttonsubtract.setOnClickListener {
            val firstnum=editfirstnumber.text.toString()
            val secondnum=editsecondnumber.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()){
                Txtanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()-secondnum.toDouble()
                Txtanswer.text=answer.toString()
            }
        }
        Buttonmultiply.setOnClickListener {
            val firstnum=editfirstnumber.text.toString()
            val secondnum=editsecondnumber.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()){
                Txtanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()*secondnum.toDouble()
                Txtanswer.text=answer.toString()
            }
        }
        Buttondivide.setOnClickListener {
            val firstnum=editfirstnumber.text.toString()
            val secondnum=editsecondnumber.text.toString()
            if(firstnum.isEmpty()&& secondnum.isEmpty()){
                Txtanswer.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble()/secondnum.toDouble()
                Txtanswer.text=answer.toString()
            }
        }

    }
}