package com.app.roomdatabase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var databse : ContactDatabse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        databse = Room.databaseBuilder(applicationContext,
            ContactDatabse::class.java,
            "contactDB").build()

        GlobalScope.launch(){
            databse.contactDao().insertContact(Contact(0,"Anup","9838160000"))
        }
    }
}