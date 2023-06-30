package com.example.clapingo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.clapingo.databinding.RvLayoutBinding
import com.example.clapingo.json_data_class.Timeslot
import org.json.JSONArray

class recycler_view_adapter(var timeslots: ArrayList<String> , var booked_Slot: ArrayList<String>):RecyclerView.Adapter<recycler_view_adapter.viewholder>() {

    class viewholder (var binding: RvLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {

        return viewholder(RvLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {


        return timeslots.size
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

        var hours :String= timeslots[position][0].toString() + timeslots[position][1].toString()

        var ts1 :String = "${hours}:00 - ${hours}:15"
        var ts2 :String = "${hours}:20 - ${hours}:35"
        var ts3 :String = "${hours}:40 - ${hours}:55"

        if(booked_Slot.size!=0){

            for(i in booked_Slot){

                if(i==ts1){
                    holder.binding.ts1.background = ContextCompat.getDrawable(holder.itemView.context, R.drawable.booked_timeslot_border)
                }
                else if(i==ts2){
                    holder.binding.ts2.background = ContextCompat.getDrawable(holder.itemView.context, R.drawable.booked_timeslot_border)
                }
                else if(i==ts3){
                    holder.binding.ts3.background = ContextCompat.getDrawable(holder.itemView.context, R.drawable.booked_timeslot_border)
                }
            }
        }



        holder.binding.ts1.text = ts1
        holder.binding.ts2.text = ts2
        holder.binding.ts3.text = ts3
    }
}