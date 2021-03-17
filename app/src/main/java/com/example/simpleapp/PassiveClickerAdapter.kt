package com.example.simpleapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simpleapp.databinding.ItemBinding


class PassiveClickerAdapter(private val passives: MutableList<PassiveClickers>):RecyclerView.Adapter<PassiveClickerAdapter.PassiveClickersViewHolder>() {
    class PassiveClickersViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PassiveClickersViewHolder {
        return PassiveClickersViewHolder(
                ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return passives.size
    }

    override fun onBindViewHolder(holder: PassiveClickersViewHolder, position: Int) {
        val currentPassive = passives[position]
        holder.binding.btPrice.text = currentPassive.price.toString()
        holder.binding.tvName.text = currentPassive.name
        holder.binding.tvCount.text = currentPassive.count.toString()
    }
}