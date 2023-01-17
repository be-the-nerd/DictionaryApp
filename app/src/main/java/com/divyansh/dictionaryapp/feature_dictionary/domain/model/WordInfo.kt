package com.divyansh.dictionaryapp.feature_dictionary.domain.model

import com.divyansh.dictionaryapp.feature_dictionary.data.remote.dto.LicenseDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String
)
