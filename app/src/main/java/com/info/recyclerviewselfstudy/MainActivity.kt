package com.info.recyclerviewselfstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var userList:ArrayList<Users>
    private lateinit var adaper:UserRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false)

        val u1 = Users(1,"Abbas","Bayramzade",R.drawable.prf1)
        val u2 = Users(1,"Chingiz","Suleymanzade",R.drawable.prf2)
        val u3 = Users(1,"Sabina","Hidayetova",R.drawable.prf3)
        val u4 = Users(1,"Andrew","Calahan",R.drawable.prf4)
        val u5 = Users(1,"O'conor","Crud",R.drawable.prf5)
        val u6 = Users(1,"Tomas","Shelby",R.drawable.prf6)
        val u7 = Users(1,"Abbas","Bayramzade",R.drawable.prf7)
        val u8 = Users(1,"Abbas","Bayramzade",R.drawable.prf8)
        val u9 = Users(1,"Abbas","Bayramzade",R.drawable.prf9)
        val u10 = Users(1,"Abbas","Bayramzade",R.drawable.prf10)
        val u11 = Users(1,"Abbas","Bayramzade",R.drawable.prf11)
        val u12 = Users(1,"Abbas","Bayramzade",R.drawable.prf12)
        val u13 = Users(1,"Abbas","Bayramzade",R.drawable.prf13)
        val u14 = Users(1,"Abbas","Bayramzade",R.drawable.prf14)
        val u15 = Users(1,"Abbas","Bayramzade",R.drawable.prf15)
        val u16 = Users(1,"Abbas","Bayramzade",R.drawable.prf16)
        val u17 = Users(1,"Abbas","Bayramzade",R.drawable.prf17)
        val u18 = Users(1,"Abbas","Bayramzade",R.drawable.prf18)
        val u19 = Users(1,"Abbas","Bayramzade",R.drawable.prf19)
        val u20 = Users(1,"Abbas","Bayramzade",R.drawable.prf20)

        userList = ArrayList<Users>()
        userList.add(u1)
        userList.add(u2)
        userList.add(u3)
        userList.add(u4)
        userList.add(u5)
        userList.add(u6)
        userList.add(u7)
        userList.add(u8)
        userList.add(u9)
        userList.add(u10)
        userList.add(u11)
        userList.add(u12)
        userList.add(u13)
        userList.add(u14)
        userList.add(u15)
        userList.add(u16)
        userList.add(u17)
        userList.add(u18)
        userList.add(u19)
        userList.add(u20)

        adaper = UserRvAdapter(mContext = this,userList)
        rv.adapter = adaper

    }
}

