package com.example.greenstrides

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.greenstrides.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.File

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "Green Strides"
        if (supportActionBar != null)
            supportActionBar?.hide()

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_pie_chart_24))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_home_24))
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_wb_incandescent_24))
        tabLayout.setSelectedTabIndicatorGravity(TabLayout.INDICATOR_GRAVITY_TOP)
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = MyAdapter(this, supportFragmentManager,
            tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    fun getTravelData(): List<TravelData>{
        val jsonFileString = getJsonDataFromAsset(applicationContext, "testData.json")
        Log.i("data", jsonFileString)

        val gson = Gson()
        val listTravelDataType = object : TypeToken<List<TravelData>>() {}.type

        return gson.fromJson(jsonFileString, listTravelDataType)
    }
}