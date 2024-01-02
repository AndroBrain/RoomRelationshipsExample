package com.androbrain.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val surname: String,
)
