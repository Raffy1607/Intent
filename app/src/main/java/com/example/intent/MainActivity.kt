package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button =
           findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMovewithDataActivity: Button =
            findViewById(R.id.btn_move_activity_data)
        btnMovewithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(
                    this@MainActivity,
                     MoveActivity::class.java
                )
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data -> {
                val movewithDataIntent = Intent(
                    this@MainActivity,
                    MovewithDataActivity::class.java
                )
                movewithDataIntent.putExtra(MovewithDataActivity.EXTRA_NAME, "Raffy")
                movewithDataIntent.putExtra(MovewithDataActivity.EXTRA_AGE, 17)
                startActivity(movewithDataIntent)
            }

           R.id.btn_dial_number -> {
               val phoneNumber = "081297374740"
               val dialphoneIntent = Intent(Intent.ACTION_DIAL,
                   Uri.parse("tel:$phoneNumber"))
               startActivity(dialphoneIntent)
           }
        }
    }

    }
