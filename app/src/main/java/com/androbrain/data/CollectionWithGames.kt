package com.androbrain.data

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class CollectionWithGames(
    @Embedded val collection: CollectionEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(CollectionGameCrossRef::class)
    )
    val games: List<GameEntity>,
)
