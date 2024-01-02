package com.androbrain.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CollectionEntity(
    @PrimaryKey val id: Long,
    val name: String,
    val libraryId: Long,
)
