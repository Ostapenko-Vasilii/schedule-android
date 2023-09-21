package com.pvstudio.schedule.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pvstudio.schedule.data.DayData
import com.pvstudio.schedule.databinding.DayPvItemBinding

public class DaysPVAdapter(private var daysList: ArrayList<DayData>) : RecyclerView.Adapter<DaysPVAdapter.DaysPViewHolder>() {
    lateinit var binding: DayPvItemBinding

    class DaysPViewHolder(itemView: View, binding: DayPvItemBinding) : RecyclerView.ViewHolder(itemView) {
        private lateinit var recyclerView: RecyclerView
        var bind = binding
        public fun daysVH(){
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaysPViewHolder {
        binding = DayPvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DaysPViewHolder()
    }

    override fun getItemCount(): Int {
        return daysList.size
    }

    override fun onBindViewHolder(holder: DaysPViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}