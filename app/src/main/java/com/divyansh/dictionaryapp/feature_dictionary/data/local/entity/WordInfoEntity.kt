package com.divyansh.dictionaryapp.feature_dictionary.data.local.entity

import androidx.room.Entity
import com.divyansh.dictionaryapp.feature_dictionary.domain.model.Meaning
import com.divyansh.dictionaryapp.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val sourceUrls: List<String>,
    val meaning: List<Meaning>,
    val id: Int
){
    fun toWordInfo(): WordInfo{
        return WordInfo(
            meanings = meaning,
            phonetic = phonetic,
            sourceUrls = sourceUrls,
            word = word,
        )
    }
}
