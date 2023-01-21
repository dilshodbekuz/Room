package com.example.room.fragment.list


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.room.R
import com.example.room.data.User
import kotlinx.android.synthetic.main.costom_row.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.costom_row,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.itemView.idtxt.text = currentItem.id.toString()
        holder.itemView.firstNametxt.text = currentItem.firstName
        holder.itemView.lastNametxt.text = currentItem.lastName
        holder.itemView.agetxt.text = currentItem.age.toString()
    }

    override fun getItemCount(): Int {
       return userList.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setData(user:List<User>){
        this.userList = user
        notifyDataSetChanged()
    }
}
