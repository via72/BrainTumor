package com.example.braintumor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "College Name : B.P. PODDAR INSTITUTE OF MANGEMENT AND TECHNOLOGY\n TEAM NAME: VIS MRI\n TEAM MEMBERS:\n ASHMITA KUMARI(TL)\n DEBADRITA BISWAS\n ARKAPRABHA CHAKRABORTY\n DEBANJANA BASAK\n ARUNAVA BANERJEE"

    }
}