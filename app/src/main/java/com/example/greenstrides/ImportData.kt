package com.example.greenstrides

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

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