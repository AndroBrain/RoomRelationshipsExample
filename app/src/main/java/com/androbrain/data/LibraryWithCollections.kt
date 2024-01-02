package com.androbrain.data

import androidx.room.Embedded
import androidx.room.Relation

data class LibraryWithCollections(
    @Embedded val library: LibraryEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "libraryId"
    )
    val collections: List<CollectionEntity>,
)
