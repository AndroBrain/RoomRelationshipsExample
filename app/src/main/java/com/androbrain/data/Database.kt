package com.androbrain.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        UserEntity::class
    ],
    version = 1,
)
abstract class Database : RoomDatabase() {
    abstract fun userDao(): UserDao
}
