package com.example.greenstrides

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ImportData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_import_data)

        if (supportActionBar != null)
            supportActionBar?.hide()

        val nextButton = findViewById<Button>(R.id.importDataScreenNextButton)
        nextButton.setOnClickListener {
            val collectDataActivity = Intent(this, CollectData::class.java)
            startActivity(collectDataActivity)
        }
    }

}