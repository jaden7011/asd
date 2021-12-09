package com.example.coin_gogogo.utility;

import android.widget.EditText;
import com.jakewharton.rxbinding4.widget.RxTextView;
import io.reactivex.rxjava3.core.Observable;

public class RxAndroidUtils {
    private static final String RXTAG = RxAndroidUtils.class.getSimpleName();
    private static RxAndroidUtils instance;

    RxAndroidUtils(){

    }

    public static RxAndroidUtils getInstance(){
        if(instance == null)
            instance = new RxAndroidUtils();
        return instance;
    }

    public Observable<String> getEditTextObservable(EditText editText){
        return RxTextView.textChanges(editText).map(charSequence -> charSequence.toString());
    }

    public String getTAG(){
        return RXTAG;
    }

}
