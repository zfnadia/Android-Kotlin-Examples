package com.example.learnkotlin.RecyclerViewExample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.learnkotlin.R
import kotlinx.android.synthetic.main.row_layout.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder>() {

    private val movieList = listOf("The Mummy", "The Mummy 2", "The Mummy 3")

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.row_layout, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val movieTitle = movieList[position]
        holder.view.textViewTitle.text = movieTitle
    }

    class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}