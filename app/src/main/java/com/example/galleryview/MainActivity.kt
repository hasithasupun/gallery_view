package com.example.galleryview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var newRecyclerView: RecyclerView
    private  lateinit var newArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading :Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.budu,
            R.drawable.car,
            R.drawable.department,
            R.drawable.science,
            R.drawable.thal,
            R.drawable.thel

        )

         heading = arrayOf(
             "lord buddha statue in university premises" ,
             "In a car alone, a long drive immediately reveals that you face the essence of boredom." ,
             "flower blooming near the department premises" ,
             "moody tones in science bamma" ,
             "Thal wata(palmire line)a road in the faculty of science,University of Kelaniya.This road has palmire trees on both sides,hence the name thal wata" ,
             "The 'Thel bamma' is another special place located on the way of sarasavi mawatha"

         )

        newRecyclerView =findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager (this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()


    }

    private fun getUserdata() {

        for (i in imageId.indices){
        val news =News(imageId[i],heading[i])
        newArrayList.add(news)


    }

     newRecyclerView.adapter = MyAdapter(newArrayList)




}