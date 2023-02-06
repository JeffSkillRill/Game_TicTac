package com.example.jeff_skillrill

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen2_players.*

class screen_2_players : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2_players)

        next.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            if (edit1.text.isNotEmpty()) {
                intent.putExtra ("playerX", edit1.text.toString())
            }
            else {
                intent.putExtra ("playerX", "Player X")
            }

            if (edit2.text.isNotEmpty()) {
                intent.putExtra ("player0", edit2.text.toString())
            }
            else {
                intent.putExtra ("player0", "Player O")
            }

            startActivity(intent)
        }
    }
}