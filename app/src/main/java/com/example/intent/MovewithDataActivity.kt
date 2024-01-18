package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MovewithDataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movewith_data)

        val btnBackActivity: Button =
            findViewById(R.id.btn_back_data2)
        btnBackActivity.setOnClickListener(this)

        val tvDataReceived: TextView =
            findViewById(R.id.tv_data_received)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getStringExtra(EXTRA_AGE, )
        val text = "Name  : $name, Your Age : $age"
        tvDataReceived.text = text
    }

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_back_data2 -> {
                val backIntent2 = Intent(
                    this@MovewithDataActivity,
                    MainActivity::class.java
                )
                startActivity(backIntent2)
            }
        }
    }
}