package com.example.koindi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.koindi.di.component.MySimplePresenter
import com.example.koindi.di.component.MyViewModel
import com.example.koindi.di.component.ParameterizeViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.java.KoinJavaComponent.get

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    // lazy injection
    private val presenter: MySimplePresenter by inject()

    // lazy injection
    private val viewModel: MyViewModel by viewModel()

    // lazy injection
    private val parameterizeViewModel: ParameterizeViewModel by viewModel { (parametersOf("name", "id")) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ${presenter.sayHello()}")

        Log.d(TAG, "onCreate: ${viewModel.sayHello()}")

        Log.d(TAG, "onCreate: ${parameterizeViewModel.sayHello()}")
    }


}
