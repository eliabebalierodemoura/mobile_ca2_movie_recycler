package com.example.iedorset24066_eliabe_ca2project_movie

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var news: Array<String>
    var count = 0
  
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        imageId = arrayOf(
            R.drawable.batman,
            R.drawable.spiderman,
            R.drawable.ambulance,
            R.drawable.the_bad_guys_panel,
        )

        heading = arrayOf(
            "BATMAN",
            "SPIDER-MAN",
            "AMBULANCE",
            "THE BAD GUYS"
        )
        news = arrayOf(
            getString(R.string.batman),
            getString(R.string.spider),
            getString(R.string.ambulance),
            getString(R.string.bad_guys)
        )



        newRecyclerView = findViewById(R.id.recyclerview)

        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {
        for (i in imageId.indices) {
            val news = News(imageId[i], heading[i])
            newArrayList.add(news)
        }

        var adapter = MyAdapter(newArrayList)


        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                //  Toast.makeText(this@MainActivity,"You clicked. $position", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity, Spider_man::class.java)
                intent.putExtra("heading", newArrayList[position].heading)
                intent.putExtra("imageId", newArrayList[position].titleImage)
                intent.putExtra("news", news[position])
                startActivity(intent)


            }

        })
    }
}
