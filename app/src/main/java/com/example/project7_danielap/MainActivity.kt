@file:Suppress("DEPRECATION")

package com.example.project7_danielap

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    //Declaration
    private var progressDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Progress_Bar
        buttonLogin.onClick {
            Handler(Looper.getMainLooper()).postDelayed({
                progressDialog = ProgressDialog(this@MainActivity)
                progressDialog?.setMessage("Loading")
                progressDialog?.show()
                startActivity<MasukActivity>()
            }, 5000)
            progressDialog?.dismiss()
        }
    }
}