package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class cityadapter(private val cityNameList: List<City>): RecyclerView.Adapter<cityViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cityViewHolder {

        val cityViewHolder = LayoutInflater.from(parent.context).inflate(R.layout.city_item_view, parent,false)

        return cityViewHolder(cityViewHolder)
    }

    override fun onBindViewHolder(holder: cityViewHolder, position: Int) {

        val cityName = cityNameList[position]
        holder.bind(cityName)

    }

    override fun getItemCount(): Int {
        return cityNameList.size;
    }
}