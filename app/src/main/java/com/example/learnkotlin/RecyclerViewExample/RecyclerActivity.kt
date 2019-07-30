package com.example.learnkotlin.RecyclerViewExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.learnkotlin.R
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        recycler_view_list.layoutManager = LinearLayoutManager(this)
        recycler_view_list.adapter = RecyclerViewAdapter()
    }
}
