package com.example.myfirstkotlinapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_layout.view.*

class RecyclerAdapter(val context: Context, val data: List<RecyclerData>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    class ViewHolder(val card: View): RecyclerView.ViewHolder(card)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view : View = LayoutInflater.from(parent.context).
        inflate(R.layout.recycler_layout, null)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if(holder != null){

            holder.card.imageView.setImageResource(data[position].images)
            holder.card.headingText.text = data[position].title
            holder.card.contentText.text = data[position].content
        }

        holder.card.setOnClickListener {
            Toast.makeText(context, data[position].title, Toast.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount(): Int = data.size


}