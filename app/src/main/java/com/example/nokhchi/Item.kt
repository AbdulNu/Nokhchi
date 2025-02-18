package com.example.nokhchi

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TableToList")
data class Item (
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    @ColumnInfo(name = "firstName")
    var firstName: String,
    @ColumnInfo(name = "lastName")
    var lastName: String
    )