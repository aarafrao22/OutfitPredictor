package com.aaraf.fashionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        var dateList = ArrayList<ModelCalendar>()
        dateList.add(ModelCalendar(3,"Monday"))
        dateList.add(ModelCalendar(4,"Tuesday"))
        dateList.add(ModelCalendar(5,"Wednesday"))
        dateList.add(ModelCalendar(6,"Thursday"))
        dateList.add(ModelCalendar(7,"Friday"))
        dateList.add(ModelCalendar(8,"Monday"))

        val adapter:CalendarAdapter = CalendarAdapter (this,dateList)

        rvCalendarView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        rvCalendarView.adapter = adapter
        adapter.notifyDataSetChanged()

    }
}