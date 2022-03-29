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


        val mainText : TextView = findViewById(R.id.main_text)
        val mainImage : ImageView = findViewById(R.id.main_image)
        val newsText : TextView =  findViewById(R.id.newsText)

val bundle : Bundle?= intent.extras

val heading = bundle!!.getString("heading")
val imageId = bundle.getInt("imageId")
val news = bundle.getString("news")

        mainText.text = heading
        newsText.text = news
        mainImage.setImageResource(imageId)


    }

}
