package com.example.greenstrides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CollectData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_data)

        if (supportActionBar != null)
            supportActionBar?.hide()

        val nextButton = findViewById<Button>(R.id.collectDataScreenNextButton)
        nextButton.setOnClickListener {
            val mainActivity = Intent(this, MainActivity::class.java)
            startActivity(mainActivity)
        }
    }

}