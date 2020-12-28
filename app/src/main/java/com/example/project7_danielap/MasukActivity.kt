package com.example.project7_danielap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_masuk.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        buttonBack.onClick { onBackPressed() }
    }
}