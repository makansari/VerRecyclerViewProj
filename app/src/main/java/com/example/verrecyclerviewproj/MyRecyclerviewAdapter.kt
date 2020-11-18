package com.example.verrecyclerviewproj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerviewAdapter(var userList : ArrayList<Users> ) : RecyclerView.Adapter<MyRecyclerviewAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun holdingViews(user : Users){
            var myName = itemView.findViewById<TextView>(R.id.textViewName)
            var myEmail = itemView.findViewById<TextView>(R.id.textViewEmail)
            var myPhone = itemView.findViewById<TextView>(R.id.textViewPhone)

            myName.setText(user.name)
            myEmail.setText(user.email)
            myPhone.setText(user.phone)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var vi = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(vi)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.holdingViews(userList[position])
    }

    override fun getItemCount(): Int {
        return userList?.size
    }
}