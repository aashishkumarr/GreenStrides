package com.example.greenstrides

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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