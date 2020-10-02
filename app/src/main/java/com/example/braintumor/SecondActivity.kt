package com.example.braintumor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //val resultTv = findViewById<TextView>(R.id.resultTv)
       // resultTv.text = "College Name : B.P. PODDAR INSTITUTE OF MANGEMENT AND TECHNOLOGY\n TEAM NAME: VIS MRI\n TEAM MEMBERS:\n ASHMITA KUMARI(TL)\n DEBADRITA BISWAS\n ARKAPRABHA CHAKRABORTY\n DEBANJANA BASAK\n ARUNAVA BANERJEE"

        val images = listOf<Image>(
            Image("Image 1",R.drawable.img1),
            Image("Image 2",R.drawable.img2),
            Image("Image 3",R.drawable.img3),
            Image("Image 4",R.drawable.img4),
            Image("Image 5",R.drawable.img5),
            Image("Image 6",R.drawable.img6),
            Image("Image 7",R.drawable.img7),
            Image("Image 8",R.drawable.img8),
            Image("Image 9",R.drawable.img9),
            Image("Image 10",R.drawable.img10),
            Image("Image 11",R.drawable.img11),
            Image("Image 12",R.drawable.img12),
            Image("Image 13",R.drawable.img13),
            Image("Image 14",R.drawable.img14),
            Image("Image 15",R.drawable.img15)
        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,images)
    }
}