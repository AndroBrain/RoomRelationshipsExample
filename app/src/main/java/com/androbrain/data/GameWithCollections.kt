package com.androbrain.data

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class GameWithCollections(
    @Embedded val game: GameEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(CollectionGameCrossRef::class)
    )
    val collection: List<CollectionEntity>,
)
