package com.androbrain.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface UserDao {
    @Transaction
    @Query("SELECT * FROM UserEntity")
    suspend fun getUsersWithLibraries(): List<UserWithLibrary>

    @Transaction
    @Query("SELECT * FROM LibraryEntity")
    suspend fun getLibrariesWithCollections(): List<LibraryWithCollections>

    @Transaction
    @Query("SELECT * FROM CollectionEntity")
    fun getCollectionsWithGames(): List<CollectionWithGames>

    @Transaction
    @Query("SELECT * FROM GameEntity")
    fun getGamesWithCollections(): List<GameWithCollections>

}
