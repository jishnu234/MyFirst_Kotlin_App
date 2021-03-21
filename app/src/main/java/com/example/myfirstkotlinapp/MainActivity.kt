package com.example.myfirstkotlinapp

import android.app.ActionBar
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private var titleText: TextView? = null
//    private var contentText: TextView? = null
//    private var imageBoard: ImageView? = null

    var isCount: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {

//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        titleText = findViewById(R.id.headingText)
//        contentText = findViewById(R.id.contentText)
//        imageBoard = findViewById(R.id.imageView)
//
//
//        titleText?.text = "Transport Car"
//        contentText?.text = "This car carries a Spring mattress"
//        imageBoard?.setImageResource(R.drawable.smiling_car)


        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))

//        actionBar?.title = Html.fromHtml("<font color='#000000'>My First Kotlin App </font>")

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(applicationContext,getData())






    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == R.id.about) {
            Toast.makeText(this, "About menu clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onBackPressed() {

        if(isCount) {
            super.onBackPressed()
        }

        isCount = true
        Toast.makeText(applicationContext, "Press again to exit", Toast.LENGTH_SHORT)
            .show()

        Handler().postDelayed(Runnable {
            isCount = false
        },2000)
    }
}