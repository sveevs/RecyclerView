package com.example.recyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class cityViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{

    fun bind(cityName:City)
    {
        val cityNameTextView:TextView=itemView.findViewById(R.id.city_name_text_view)
        cityNameTextView.text = cityName.CityG

        val cityNameTextViewChis:TextView=itemView.findViewById(R.id.city_name_chis)
        cityNameTextViewChis.text = cityName.CityCh

        itemView.setOnClickListener {
            Toast.makeText(itemView.context,cityName.CityCh ,Toast.LENGTH_LONG).show()


        }
    }
}
