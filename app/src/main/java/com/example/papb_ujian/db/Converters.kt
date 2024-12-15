package com.example.papb_ujian.db

import androidx.room.TypeConverter
import com.example.papb_ujian.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        // Asumsikan konstruktor Source memiliki parameter name
        return Source(name, name)
    }
}