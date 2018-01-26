package com.example.gridlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topics = listOf<String>("Education","Finance","Government","Entertainment","Technology","Math","Biology","Physics","Chemistry","Space","Sports","Music","Animal","Countries","Weather","Politics","Traffic","Poverty","Social Media","Internet","Housing")
        val gridLayoutManager = GridLayoutManager(this,2)
        val gridListAdapter = GridListAdapter(topics)

        recycler_view.setHasFixedSize(true)
        recycler_view.layoutManager = gridLayoutManager
        recycler_view.adapter = gridListAdapter
    }
}
