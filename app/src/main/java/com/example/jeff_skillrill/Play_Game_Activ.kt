package com.example.jeff_skillrill

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_play_game.*

class Play_Game_Activ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game)

        playBtn.setOnClickListener {
            startActivity(Intent(this, screen_2_players::class.java))
        }
    }
}