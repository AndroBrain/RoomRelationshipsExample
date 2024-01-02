package com.androbrain.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CollectionGameCrossRef(
    @PrimaryKey val collectionId: Long,
    @PrimaryKey val gameId: Long,
)
