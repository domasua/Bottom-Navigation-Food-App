package com.example.bottomnavigationactivity.ui.discovery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DiscoveryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DiscoveryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Discovery fragment");
    }
    public LiveData<String> getText(){
        return mText;
    }
}

