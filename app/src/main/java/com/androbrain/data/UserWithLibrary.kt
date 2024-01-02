package com.androbrain.data

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithLibrary(
    @Embedded val user: UserEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "ownerId",
    )
    val library: LibraryEntity,
)
