package com.example.colorviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    
    private fun setListeners() {
        val clickableViews: List<Int> =
            listOf(
                R.id.box_one_text, R.id.box_two_text, R.id.box_three_text,
                R.id.box_four_text, R.id.box_five_text, R.id.constraint_layout
            )

        for (item in clickableViews) {
            val box: View = findViewById(item)
            box.setOnClickListener { makeColored(it) }

        }
    }

        private fun makeColored(view: View) {
            when (view.id) {
                R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
                R.id.box_three_text -> view.setBackgroundColor(ContextCompat.getColor(applicationContext, android.R.color.holo_green_light))
                R.id.box_four_text -> view.setBackgroundColor(ContextCompat.getColor(applicationContext, android.R.color.holo_green_dark))
                R.id.box_five_text -> view.setBackgroundColor(ContextCompat.getColor(applicationContext, android.R.color.holo_green_light))

                else -> view.setBackgroundColor(Color.CYAN)
        }

    }
}