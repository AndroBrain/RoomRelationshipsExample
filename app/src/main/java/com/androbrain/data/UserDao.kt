package com.androbrain.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface UserDao {
    @Transaction
    @Query("SELECT * FROM UserEntity")
    suspend fun getUsersWithLibraries(): List<UserWithLibrary>
}
