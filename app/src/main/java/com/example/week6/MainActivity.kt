package com.example.week6

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? =  null
    var foodMenuText = arrayOf(
        "กีต้าร์",
        "เบส",
        "ไวโอลีน",
        "กลองชุด",
        "เปียโน",
        "ทรัมเป็ด",
        "คีย์บอร์ด",
        "แซ๊กโซโฟน",
        "คลาริเนต",
        "ทรัมโบลีน",
        "ฮาฟ",
        "แคน",
        "ระนาดเอก",
        "")
    var foodMenuImage = arrayOf<Int>(
        R.drawable.a1,
        R.drawable.a2,
        R.drawable.a3,
        R.drawable.a4,
        R.drawable.a5,
        R.drawable.a6,
        R.drawable.a7,
        R.drawable.a8,
        R.drawable.a9,
        R.drawable.a10,
        R.drawable.a11,
        R.drawable.a12,
        R.drawable.a13,
        R.drawable.a14
    )
    var context : Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("เครื่องดนตรี")
        recyclerView = findViewById(R.id.recycler) as RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapter(foodMenuText,foodMenuImage,context)
        recyclerView!!.adapter = myAdapter
    }
}
