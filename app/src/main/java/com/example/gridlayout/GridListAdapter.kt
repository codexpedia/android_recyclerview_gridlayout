package com.example.gridlayout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class GridListAdapter(private val itemList: List<String>) : RecyclerView.Adapter<GridListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, null)
        return ViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTopic.text = itemList[position]
    }

    override fun getItemCount() = itemList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var tvTopic: TextView

        init {
            itemView.setOnClickListener(this)
            tvTopic = itemView.findViewById<View>(R.id.topic) as TextView
        }

        override fun onClick(view: View) {
            Toast.makeText(view.context,
                    "Clicked Position = " + adapterPosition, Toast.LENGTH_SHORT)
                    .show()
        }
    }
}