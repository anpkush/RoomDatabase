package com.app.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabse : RoomDatabase() {

        abstract fun contactDao() : ContactDAO

}