package com.info.recyclerviewselfstudy

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rc_item.view.*
import java.util.*

class UserListViewHolder(view:View):RecyclerView.ViewHolder(view) {

    fun bindItems(users: Users){

        val image:ImageView = itemView.img_user_profil

        val userName:TextView = itemView.tv_user_name

        val userSurname:TextView = itemView.tv_usersurname

        image.setImageResource(users.userProfilpicture)
        userName.text = users.userName
        userSurname.text  = users.userSurname

    }

}