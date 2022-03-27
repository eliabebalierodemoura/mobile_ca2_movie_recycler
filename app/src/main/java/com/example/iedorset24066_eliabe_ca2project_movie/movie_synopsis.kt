package com.example.iedorset24066_eliabe_ca2project_movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
var seats = 7
var count = 0
class Spider_man : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synopsis)

        var textview2 = findViewById<TextView>(R.id.textview2)
        var textview = findViewById<TextView>(R.id.textview)

        var addbutton = findViewById<View>(R.id.addbutton)
        addbutton.setOnClickListener{

            count++
            textview.text = count.toString()
            seats--
            textview2.text = seats.toString()


        }

        var minusButton = findViewById<View>(R.id.minusButton)
        minusButton.setOnClickListener{

            count--
            textview.text = count.toString()
            seats++
            textview2.text = seats.toString()

        }


        val headingSpider : TextView = findViewById(R.id.spidertext)
        val imageSpider : ImageView = findViewById(R.id.spider_image)

val bundle : Bundle?= intent.extras

val heading = bundle!!.getString("heading")
val imageId = bundle.getInt("imageId")
val news = bundle.getString("news")

        headingSpider.text = heading
        imageSpider.setImageResource(imageId)


    }

}
