package com.devspace.recyclerview

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


class ContactListAdapter:
    ListAdapter<Contac, ContactListAdapter.ContactViewHolder> (ContactDiffutils()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }





    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val tvName = view.findViewById<TextView>(R.id.tv_name)
        private val tvPhone = view.findViewById<TextView>(R.id.tv_phone)
        private val image = view.findViewById<ImageView>(R.id.imagen)
        fun bind(contact: Contac){
            tvName.text = contact.name
            tvPhone.text = contact.phone
            image.setImageResource(contact.icon)

        }

    }

    class ContactDiffutils: DiffUtil.ItemCallback<Contac>(){
        override fun areItemsTheSame(oldItem: Contac, newItem: Contac): Boolean {
                return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Contac, newItem: Contac): Boolean {
            return oldItem.name == newItem.name
        }

    }


}