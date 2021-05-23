package com.example.samplecontour

import android.R.attr.password
import android.os.Bundle
import android.text.InputType
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(MainView(this))

    }
}