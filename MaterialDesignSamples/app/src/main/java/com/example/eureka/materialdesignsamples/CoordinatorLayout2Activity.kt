package com.example.eureka.materialdesignsamples

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class CoordinatorLayout2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator1)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(true)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val appBar = findViewById(R.id.app_bar) as AppBarLayout
        var scrollRange = -1
        appBar.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (scrollRange == -1) {
                scrollRange = appBarLayout.totalScrollRange
            }
            if (scrollRange + verticalOffset != 0) {
                toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_white)
            } else {
                toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_black)
            }
        }
        toolbar.setNavigationOnClickListener { finish() }
    }
}
