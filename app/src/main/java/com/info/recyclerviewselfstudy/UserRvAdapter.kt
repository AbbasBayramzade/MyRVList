package com.info.recyclerviewselfstudy

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserRvAdapter(private val mContext: Context,private val UserList:List<Users>):RecyclerView.Adapter<UserListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        return  UserListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rc_item,parent,false))
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        holder.bindItems(UserList[position])
    }

    override fun getItemCount(): Int {
       return UserList.size
    }


}