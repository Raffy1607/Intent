package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.view.View

class MoveActivity : AppCompatActivity(),
    View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val btnBackActivity: Button =
            findViewById(R.id.btn_back)
        btnBackActivity.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back -> {
                val backIntent = Intent(
                    this@MoveActivity,
                    MainActivity::class.java
                )
                startActivity(backIntent)
            }
        }
    }

}

