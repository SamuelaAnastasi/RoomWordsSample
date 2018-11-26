package com.example.android.roomwordssample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository wordRepository;
    private LiveData<List<Word>> allWords;


    public WordViewModel(@NonNull Application application) {
        super(application);
        wordRepository = new WordRepository(application);
        allWords = wordRepository.selectAll();
    }

    LiveData<List<Word>> selectAll() {
        return allWords;
    }

    public void insert(Word word) {
        wordRepository.insert(word);
    }

    public void deleteAll() {
        wordRepository.deleteAll();
    }

    public void deleteWord(Word word) {
        wordRepository.deleteWord(word);
    }

    public void updateWord(Word word) {
        wordRepository.updateWord(word);
    }
}
