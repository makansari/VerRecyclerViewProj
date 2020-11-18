package com.example.verrecyclerviewproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRecyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        myRecyclerview.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        var myList = ArrayList<Users>()

        myRecyclerview.adapter = MyRecyclerviewAdapter(myList)

        myList.add(Users("Venu","venu@gmail.com","258963147"))
        myList.add(Users("karthik","karthik@gmail.com","5444545357"))
        myList.add(Users("Shergil","Shergil@gmail.com","42424278784"))
        myList.add(Users("Manoj","Manoj@gmail.com","258963147"))
        myList.add(Users("Rahul","Rahul@gmail.com","787878525"))
        myList.add(Users("Murali","Murali@gmail.com","98988898888"))

    }
}