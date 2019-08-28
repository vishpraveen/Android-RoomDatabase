package com.e.roomwordsample.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.e.roomwordsample.interfaces.WordDao
import com.e.roomwordsample.models.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }

}