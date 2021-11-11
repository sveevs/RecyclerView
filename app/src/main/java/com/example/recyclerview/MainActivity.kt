package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CityOb:List<City> = listOf(
            City("Москва","12 655 050"),
            City("Астрахань","524 371"),
            City("Глазов","91 921"),
            City("Ижевск","646 468"),
            City("Сарапул","94 554"),
            City("Владивосток","600 871"),
        )

        //val cityNameList:List<String> = listOf("Москва","Астрахань","Глазов","Ижевск", "Сарапул","Владивосток")
        //val cityNameListChis:List<String> = listOf("12 655 050 ","524 371","91 921","646 468", "94 554","600 871")



        //val cityRecyclerView : RecyclerView = findViewById(R.id.Recycler_View)
        //cityRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        //cityRecyclerView.adapter= cityadapter(cityNameList)

        val cityRecyclerViewChis : RecyclerView = findViewById(R.id.Recycler_View)
        cityRecyclerViewChis.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        cityRecyclerViewChis.adapter= cityadapter(CityOb)
        //cityRecyclerViewChis.adapter= cityadapter(CityOb.CityCh)
    }
}