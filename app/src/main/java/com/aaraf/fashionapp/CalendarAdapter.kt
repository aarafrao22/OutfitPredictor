package com.aaraf.fashionapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CalendarAdapter(var context: Context,var date: List<ModelCalendar>) :
    RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var txtDate: TextView = itemView.findViewById<TextView>(R.id.txtDate)
        var txtDay: TextView = itemView.findViewById<TextView>(R.id.txtDay)

         fun setData(date:Int,day: String) {
            this.txtDate.text = date.toString()
            this.txtDay.text = day

            itemView.setOnClickListener {
//                val viewPrediction:Intent
                Toast.makeText(context,"Clicked",Toast.LENGTH_LONG)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarAdapter.ViewHolder {
        val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = layoutInflater.inflate(R.layout.dateview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalendarAdapter.ViewHolder, position: Int) {
        holder.setData(date[position].date,date[position].day)
    }



    override fun getItemCount(): Int {
        return 5
    }
}