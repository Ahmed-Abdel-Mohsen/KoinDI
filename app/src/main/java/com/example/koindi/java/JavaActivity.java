package com.example.koindi.java;

import static org.koin.java.KoinJavaComponent.inject;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.koindi.R;
import com.example.koindi.di.component.MySimplePresenter;
import com.example.koindi.java.di.MyJavaPresenter;

import kotlin.Lazy;

public class JavaActivity extends AppCompatActivity {
    public static final String TAG = "JavaActivity";

    private final Lazy<MySimplePresenter> simplePresenter = inject(MySimplePresenter.class);
    private final Lazy<MyJavaPresenter> myJavaPresenterLazy = inject(MyJavaPresenter.class);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + simplePresenter.getValue().sayHello());
        Log.d(TAG, "onCreate: " + myJavaPresenterLazy.getValue().sayHello());
    }
}
