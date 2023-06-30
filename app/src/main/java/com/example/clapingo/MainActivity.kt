package com.example.clapingo

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.clapingo.databinding.ActivityMainBinding
import org.json.JSONObject
import java.io.InputStream

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding?=null
    var rv_adapter: recycler_view_adapter?=null
    var item:String ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        read_json()

        var options = arrayOf(
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        )


        val arrayAdapter = ArrayAdapter(this, R.layout.list_item, options)

        binding?.autoCompleteTv?.setAdapter(arrayAdapter)

        binding?.autoCompleteTv?.setOnItemClickListener { parent, view, position, id ->
            item=options[position]

            read_json()

        }

    }



    private fun read_json() {

        var json:String ?= null

        try {

            var inputstream:InputStream = assets.open("data.json")
            json = inputstream.bufferedReader().use { it.readText() }

            var obj: JSONObject = JSONObject(json)


            var demo: JSONObject = obj.getJSONObject("teacher")
            var name = demo.getString("name")
            var image = demo.getString("image")
            var rating=  obj.getString("rating")
            var description = demo.getString("description")

            binding?.tvName?.text=name
            binding?.tvRating?.text=rating
            binding?.teacherDesc?.text = description



            var timeslots: JSONObject = obj.getJSONObject("timeslot")
            var booked_slots: JSONObject = obj.getJSONObject("bookedTimings")

            val weekday = timeslots.getJSONArray(item.toString())
            val booked_day = booked_slots.getJSONArray(item.toString())

            if(weekday.length()==0){
                Toast.makeText(this, "No Slots Available", Toast.LENGTH_LONG).show()
            }

                val timeslot_list = ArrayList<String>()
                for (i in 0 until weekday.length()) {
                    timeslot_list.add(weekday.getString(i))
                }

                val booked_list = ArrayList<String>()
                for (j in 0 until booked_day.length()) {
                booked_list.add(booked_day.getString(j))
                }

                rv_adapter = recycler_view_adapter(timeslot_list , booked_list)
                binding?.rv?.adapter = rv_adapter
        }
        catch (e: Exception){
        }
    }
}