package com.example.greenstrides

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val settings = getSharedPreferences("green_strides", Context.MODE_PRIVATE)
        val isFirstTimeUser = settings.getBoolean("firstTimeUser", true)

        if (!isFirstTimeUser) {
            // TODO redirect to the home page if already use the app before
            val mainActivity = Intent(this, CollectData::class.java)
            startActivity(mainActivity)
            return
        }

        setContentView(R.layout.activity_start_screen)

        if (supportActionBar != null)
            supportActionBar?.hide()

        val nextButton = findViewById<Button>(R.id.startScreenNextButton)
        nextButton.setOnClickListener {
            val importDataActivity = Intent(this, ImportData::class.java)
            startActivity(importDataActivity)
        }
    }


}