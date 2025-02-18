package com.example.nokhchi

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1)
abstract class MainDb: RoomDatabase() {
 abstract fun getDao():Dao

 companion object{
fun getDb(context: Baydarka): MainDb{
return Room.databaseBuilder(
    context.applicationContext,
    MainDb::class.java,
    "test.db"
).build()
}
 }
}