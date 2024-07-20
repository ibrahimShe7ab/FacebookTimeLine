package com.example.facebooktimeline

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: facebookAdapter
    lateinit var list:List<FacebookDataClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.facebook_recycler)
        list= mutableListOf()
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.profile,"Welcome to my world",11.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.question_marsk,"${LoremIpsum(60)}",11.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.photo,"${LoremIpsum(20)}",1.6))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.gaza_poto,"${LoremIpsum(20)}",1.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.gaza,"${LoremIpsum(10)}",8.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.user,"${LoremIpsum(10)}",7.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.profile,"${LoremIpsum(10)}",9.5))

        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.gaza_poto,"${LoremIpsum(20)}",1.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.gaza,"${LoremIpsum(10)}",8.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.profile,"${LoremIpsum(50)}",10.5))
        (list as MutableList<FacebookDataClass>).add(FacebookDataClass(R.drawable.profile,"${LoremIpsum(10)}",11.10))
            adapter= facebookAdapter(list)
        recyclerView.adapter=adapter

    }
}