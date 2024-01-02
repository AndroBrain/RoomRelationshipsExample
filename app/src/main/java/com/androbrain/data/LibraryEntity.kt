package com.androbrain.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LibraryEntity(
    @PrimaryKey val id: Long,
    val ownerId: Int,
)
