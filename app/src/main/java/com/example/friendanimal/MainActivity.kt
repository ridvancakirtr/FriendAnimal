package com.example.friendanimal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract

class MainActivity : AppCompatActivity() {
    var animals=ArrayList<AnimalData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

    }

    fun loadData(){
        var animImage= arrayOf(
            R.drawable.cat_one,
            R.drawable.cat_two,
            R.drawable.cat_three,
            R.drawable.parot_four,
            R.drawable.parot_one,
            R.drawable.parot_two,
            R.drawable.parot_three,
            R.drawable.parot_four
        )

        var animName= arrayOf(
            "Cat One",
            "Cat Two",
            "Cat Three",
            "Cat Four",
            "Parot One",
            "Parot Two",
            "Parot Three",
            "Parot Four"
        )

        for (i in 0 until animImage.size){
            var addData=AnimalData(animName[i],animImage[i])
            animals.add(addData)
        }
    }
}
